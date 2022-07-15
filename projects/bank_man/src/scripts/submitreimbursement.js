let reimbType = document.getElementById("reimb-type").value; // assign this element as a variable
let reimbAmount = document.getElementById("reimb-amount").value; //tapping into input element object, gets input value

//always select, then manipulate

let submitBtn = document.getElementById('submit');

submitBtn.addEventListener("click", submitValues);

async function submitValues(){
    console.log("FIRE");
 //things happening aysnc

const data = {reimbType: reimbType, reimbAmount:reimbAmount}

let response = await fetch(`${apiUrl}/reimbursements`,{
    method: 'POST',
    headers: {
        'Content-Type': 'application/x-www-form-urlencoded'
    },
    body: JSON.stringify(data)
    
})
    return response.json();
    
}

// submitting a body of data(POST REQUEST)
