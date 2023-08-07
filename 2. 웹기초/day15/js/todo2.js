const todoApp = { // 함수 형태로 객체 생성
    // 스케출 추가
    insert() {
        try {
            const todo = frm.todo.value.trim(); // 앞뒤 여백 제거
            if (!todo) { // todo 를 입력하지 않은 경우
                throw new Error("할일을 입력하세요."); 
            }

            const todos =document.getElementById("todos");

            const tpl = document.getElementById("tpl");
            let data = tpl.innerHTML; // type="text/html"
            data = data.replace(/#\[todo\]/g, todo);

            const domParser = new DOMParser(); // 문자열 -> HTML DOM 변경
            const dom = domParser.parseFromString(data, "text/html"); // 아직은 메모리상에만 추가됨
            const li = dom.querySelector("li");

            todos.appendChild(li);
            frm.todo.value = "";
            frm.todo.focus();

            // 삭제 클릭 처리
            const remove = li.querySelector(".remove");
            remove.addEventListener("click", todoApp.delete);


        } catch (err) {
            alert(err.message);
        }
    },
    delete() {
        if (!confirm("정말 삭제하시겠습니까?")) {
            // 삭제 취소를 클릭 했을 때
            return; // 실행 종료
        }

        // 확인을 클릭 했을 때 -> 삭제 진행

        // this : 이벤트가 발생한 요소
        const li = this.parentElement;
        // ul
        li.parentElement.removeChild(li);
    }
};

window.addEventListener("DOMContentLoaded", function() {
    // 스케줄 추가 처리
    const register = document.getElementById("register");
    register.addEventListener("click", todoApp.insert);

});