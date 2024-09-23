document.getElementById("send").addEventListener("click", function() {
    fetch('http://localhost:8080/api/trimite-mesaj', {
        method: 'POST'
    })
        .then(response => response.text())
        .then(data => {
            console.log(data);
            alert('Message Sent!');
        })
        .catch(error => console.error('Error:', error));
});