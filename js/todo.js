const form =document.getElementById("form");
const input = document.getElementById("input");
const tr =document.getElementById("tr");

const todos = JSON.parse(localStorage.getItem("todos"));

if(todos){
    todos.forEach(todo=>{
        add(todo);
    })
}

form.addEventListener("submit",function (event){
    event.preventDefault();
    add();
});

function add(todo){
    let todoText = input.value;

    if(todo){
        todoText=todo.text ;
    }

    if(todoText.length > 0){
        const td = document.createElement("td");
        td.innerText = todoText ; 
        td.classList.add("list-group");

        if (todo && todo.completed) {
            td.classList.add("text-decoration-line-through");
        }

        td.addEventListener("contextmenu",function(event){
                event.preventDefault();
                td.remove();
                saveData();
        });

        td.addEventListener("click",function (){
            td.classList.toggle("text-decoration-line-through");
            saveData();
        });

        tr.appendChild(td);
        input.value="";
        saveData();
    }
}

function saveData() {
    const lists =document.querySelectorAll("td");
    let todos =[];
    lists.forEach(list => {
        let todo ={
            text: list.innerText,
            completed: list.classList.contains("text-decoration-line-through")
        };
        todos.push(todo);
    });
    localStorage.setItem("todos",JSON.stringify(todos));
}