// function search(ele) {
//     if(event.key === 'Enter') {
//         //Here we get the Value and search for the REST API
//         document.getElementById('article01Image').src = "http://farm5.staticflickr.com/4887/45849250455_fe483a156b.jpg";
//         document.getElementById('article01Href').href = "http://farm5.staticflickr.com/4887/45849250455_fe483a156b.jpg";
//         document.getElementById('test01')
//         alert(ele.value);    
//     }
    
// }
$(document).ready(function () {
    var token = read('token');
    console.log(token);
    if (!token){
        window.location.replace("index.html");
    }
});

$(function() {
    $('#searchBtn').on('click', function (e) {
        e.preventDefault(); // disable the default form submit event

        // disable button until data is loaded
        $('#searchBtn').prop("disabled",true);
        $('#searchBtn').html('Loading...');


        $.ajax({
            url: "/analyze",
            type: "POST",
            data: {
                text: $('#searchText').val(),
                token: read('token')
            },
            success: function (response) {
                $('#confidence').text(response.confidence + "%");

                document.getElementById('img01').src = response.pictureURL[0];
                document.getElementById('img02').src = response.pictureURL[1];
                document.getElementById('img03').src = response.pictureURL[2];
                document.getElementById('img04').src = response.pictureURL[3];
                document.getElementById('img05').src = response.pictureURL[4];
                document.getElementById('img06').src = response.pictureURL[5];
                document.getElementById('img07').src = response.pictureURL[6];
                document.getElementById('img08').src = response.pictureURL[7];
                document.getElementById('img09').src = response.pictureURL[8];



            },
            error: function (response) {
                alert('error loading data');
            },
            complete: function(data) {
                $('#searchBtn').prop("disabled",false);
                $('#searchBtn').html('Search');
            }
        });
    });
});