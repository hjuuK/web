window.addEventListener("DOMContentLoaded", function() {
    const todos = document.getElementById("todos");
    const registerEl = document.getElementById("register");
    registerEl.addEventListener("click", function() {
        try {
            const todo = frm.todo.value;
            if (!todo.trim()) { // 값이 입력되지 않은 경우 => 공백
                throw new Error("오늘 할일을 입력하세요.");
            }

            createTodo(todo);
            
        } catch(err) {
            alert(err.message);
        }
    });

    const insertEl = document.getElementById("insert");
    insertEl.addEventListener("click", function() {
        const lastEl = todos.lastElementChild;
        const li = createTodo("테스트");
        todos.insertBefore(li, lastEl);
    });

    function createTodo(todo) {
        // 오늘 할일을 입력한 경우
        const li = document.createElement("li");
        const text = document.createTextNode(todo);
        li.appendChild(text); // 아직 메모리상에만 있음
        
        const span = document.createElement("span"); // 제거할수있는 x버튼을 span태그로 추가하기
        const removeTxt = document.createTextNode("[X]");
        span.appendChild(removeTxt);
        li.appendChild(span);

        todos.appendChild(li); // ul 안에 li태그 추가

        frm.todo.value = ""; // 입력칸 등록하고 나서 비우기
        frm.todo.focus(); // 입력칸으로 포커스 이동


        // 할일 제거 // span태그([X])가 클릭되면 제거
        span.addEventListener("click", function() {
            if (confirm("정말 삭제하시겠습니까?")) {
                todos.removeChild(li);
            }
        });

        return li;
    }
});