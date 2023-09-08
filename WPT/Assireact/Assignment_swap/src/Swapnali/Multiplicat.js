import {useState }from "react";
function Multiplicat(){
        const [result, setResult]= useState(0)
        const handleSubmit= function(event){
            event.preventDefault()
            var num1=event.target.num1.value
            var num2=event.target.num2.value
            setResult(Number(num1) * Number(num2))
}
 return <div>
    <form onSubmit={handleSubmit}>
        Enter num1:<input type="text" name="num1"></input>
       <br></br>
        Enetr num2:<input type="text" name="num2"></input>
        <br></br>
        <button>MultiplicatS</button>
        <br></br>
    </form>
    <span>Result is :-{result}</span>
</div>


}




export default Multiplicat;
