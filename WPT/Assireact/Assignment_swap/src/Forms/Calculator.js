import {useState} from "react"
function Calculator (){

    const [result,setResult]=useState(0)
    const handleSubmit=function(event){
            event.preventDefault()//stop from default behaviour
            var num1=event.target.num1.value
            var num2=event.target.num2.value
            setResult= Number(num1)+Number(num2)
            
    }
    return <div>
        <form onSumit={handleSubmit}>
         Enter No-1<input type="text" name="num1"></input>
         Enter No-2<input type="text" name="num2"></input>
         <button>Add</button> 
          </form>
          <span>Result is :{result}</span>
    </div>
}

export default Calculator;