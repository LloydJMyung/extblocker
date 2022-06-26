function check(box) {
    let $positions = document.querySelectorAll(".position-checkbox:checked");
    const positions = [];
    for(let i = 0; i < $positions.length; i++) {
        position.push($positions[i].value)
    }

    fetch("/checkform", {
        method: 'post',
        headers: {
            'content-type' : 'application/json'
        },
        body : JSON.stringify({
            positions : positions
        })
    })
}

function addCustoms() {
    let $input = document.getElementByID("custom_ext").value;

    fetch("/customs", {
        method: 'post',
        headers: {
            'content-type' : 'application/json'
        },
        body : JSON.stringify({
            ext : $input
        })
    })
}

