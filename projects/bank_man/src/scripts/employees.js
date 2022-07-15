
let viewLogOutButton = document.getElementById("viewLogOut");
let viewSubmitRequestButton = document.getElementById('viewSub');
let viewResolvedRequestButton = document.getElementById('viewRes');
let viewPendingRequestButton = document.getElementById('viewPend');
let viewInfoButton = document.getElementById('viewInfo');

viewLogOutButton.addEventListener('click', viewLogOut);
viewSubmitRequestButton.addEventListener('click', viewSub);
viewResolvedRequestButton.addEventListener('click', viewRes);
viewPendingRequestButton.addEventListener('click', viewPend);
viewInfoButton.addEventListener('click', viewInfo);


async function viewLogOut(){
    window.location.href="./login.html"
}

async function viewSub(){
    window.location.href="./submitreimbursement.html";
}

async function viewRes(){
    window.location.href="./viewrquest.html";
}

async function viewPend(){
    window.location.href="./viewpendingrequest.html";
}

async function viewInfo(){
    window.location.href="./viewUserInfo.html";
}