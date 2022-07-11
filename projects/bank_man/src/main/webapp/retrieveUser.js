

let baseApiURL = 'http://localhost:8080/bank_man/'; //front end?

async function getData() {
    // console.log('Button was clicked!');
    // let id = document.getElementById('dataInput').value;
    // console.log(`id = ${id}`);

    let httpResponse = await fetch(`${baseApiURL}/users/1`);
    //URL/table/colum1

    if(httpResponse.status >= 200 && httpResponse.status < 300){
    let data = await httpResponse.json();

    populateData(data);
    
    } else {
        console.log('Invalid request.');
    }
};

function populateData(response) {
    console.log(response);

};

getData();