package models.member;

import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberDao {
    private final JdbcTemplate jdbcTemplate;

    /*
    public boolean register(Member member) {
        String hash = BCrypt.hashpw(member.getUserPw(), BCrypt.gensalt(12));

        String sql = "INSERT INTO member (userId, userPw, userNm) VALUES (?,?,?)";
        int affectedRows = jdbcTemplate.update(sql, member.getUserId(), hash, member.getUserNm());

        return affectedRows > 0;
    }
     */

    public boolean register(Member member) {
        String hash = BCrypt.hashpw(member.getUserPw(), BCrypt.gensalt(12));
        String sql = "INSERT INTO member (userId, userPw, userNm) VALUES (?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int affectedRows = jdbcTemplate.update(c ->  {
            PreparedStatement pstmt = c.prepareStatement(sql, new String[] {"userNo"}); // 증감번호
            pstmt.setString(1, member.getUserId());
            pstmt.setString(2, hash);
            pstmt.setString(3, member.getUserNm());

            return pstmt;
        }, keyHolder);

        Number key = keyHolder.getKey();    // 상위 클래스인 Number가 반환값 => 매개변수가 변수인지 실수인지 모를 때 / 사용하는 상황에 맞게 바꿔서 쓰면 됨
        long userNo = key.longValue();
        member.setUserNo(userNo);

        return affectedRows > 0 ;
    }

    public List<Member> getList() {
        String sql = "SELECT * FROM member ORDER BY regDt DESC";

        List<Member> members = jdbcTemplate.query(sql, this::mapper);  // (rs, i) -> mapper(rs,i)

        return members;
    }

    public Member get(String userId) {
        try {
            String sql = "SELECT * FROM member WHERE userId = ?";
            Member member = jdbcTemplate.queryForObject(sql, this::mapper, userId); // (sql, (rs, i) -> mapper(rs,i), userId);

            return member;
        } catch (Exception e) {
            e.printStackTrace();
            return null; // 데이터가 없거나 잘 못 조회했을 경우
        }
    }

    public long getTotal() {
        String sql = "SELECT COUNT(*) FROM member";
        long total = jdbcTemplate.queryForObject(sql, long.class);
        return total; // 전체 갯수
    }

    private Member mapper(ResultSet rs, int i) throws SQLException {
            return Member.builder()
                    .userNo(rs.getLong("userNo"))
                    .userId(rs.getString("userId"))
                    .userPw(rs.getString("userPw"))
                    .userNm(rs.getString("userNm"))
                    .regDt(rs.getTimestamp("regDt").toLocalDateTime())
                    .build();
        }
}
