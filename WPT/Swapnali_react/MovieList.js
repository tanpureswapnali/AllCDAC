import { useState} from "react";
function MovieList(){
    const [users, setUsers]=useState([]);
    const handleSubmit=function(event){
        event.preventDefault();
        var temp={
            name:event.target.name.value,
            aname:event.target.aname.value,
            date:event.target.date.value,
            type:[...event.target.type].filter((item) => item.checked).map((ele)=>ele.value),
            state:event.target.state.value
            
        };
        console.log(temp);
        setUsers([...users, temp]);
    };

    return (
     <div>
        <form onSubmit={handleSubmit}>
            MovieName<input type="text" name="name"/>
            <br></br>
            ActorName<input type="text" name="aname"/>
            <br></br>
            ReaDate<input type="date" name="date"/>
            <br></br>
            MovieType<input type="checkbox" name="type" value="2D"/>2D
            <input type="checkbox" name="type" value="3D"/>3D
            <input type="checkbox" name="type" value="MAX"/>MAX
            <br></br>
            state<select name="state">
                <option value="MH">MH</option>
                <option value="UP"> Up</option>
                <option value="MP">MP</option>
            </select>
            <br></br>
            <br></br>
            <button>save</button>
        
        </form>
        <hr/>
        <br></br>
        <table border="1">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>ActorName</th>
                    <th>ReaDate</th>
                    <th>MovieType</th>
                    <th>state</th>
                </tr>
            </thead>
            <tbody>
            {users.map((item) =>(
                <tr>
                    <td>{item.name}</td>
                    <td>{item.aname}</td>
                    <td>{item.date}</td>
                    <td>{item.type.join(" , ")}</td>
                    <td>{item.state}</td>
                </tr>
                ))}
            </tbody>

        </table>
    </div>
    );            
}

export default MovieList;