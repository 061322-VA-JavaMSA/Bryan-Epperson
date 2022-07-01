// document.getElementById('getData').onclick = getData;
document.getElementById('getData').addEventListener("click", getData);

/*
    - When button is clicked, send http request to API for a specific id

    - get the id value from input box
    - send request to PokeAPI
        - Method: GET
        - Headers: None
        - Body: None
        - url: https://pokeapi.co/api/v2/pokemon/ + id from input box
    - might have to convert JSON to JS object

    - populate the data in Section
*/
let baseApiURL = 'https://pokeapi.co/api/v2/pokemon';




async function getData() {
    console.log('Button was clicked!');
    let id = document.getElementById('dataInput').value;
    let pokemonPic = document.getElementById('picture');

    console.log(`id = ${id}`);

    let httpResponse = await fetch(`${baseApiURL}/${id}`);

    if(httpResponse.status >= 200 && httpResponse.status < 300){
    let data = await httpResponse.json();


    populateData(data);
    

    } else {
        console.log('Invalid request.');
    }

}



function populateData(response) {
    let moveName = document.getElementById('moves');
    let pictureShow = document.getElementById('picture');
    let name = document.getElementById('name');
    pictureShow.setAttribute('src', `${response.sprites.front_default}`);
    name.innerHTML = (`${response.name}`);
    name.innerHTML = (`${response.moves}`);
    
    console.log(`${response.names}`);
    

    console.log(response);
}