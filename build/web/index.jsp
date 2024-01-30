<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Flower Plant Website</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
     <link rel="stylesheet" href="css/aboutus.css">
     <link rel="stylesheet" href="css/spec.css">
     <link rel="stylesheet" href="css/contact.css">
<a href="index.jsp"></a>
     
     <style>
         body::-webkit-scrollbar {
             width: 0;
             display: none;
         }
     </style>
</head>

<body>
                <%@include file="nav1.jsp" %>
                <%@include file="slider.jsp" %>
               
<section class="special-offers" id="special">
    <div class="container" style=" color: #ccffff;">
    <h2>Special Offers</h2>
    <div class="row">
      <div class="col-md-4">
        <div class="card">
           
          <img src="img/jasmin.jpg" class="card-img-top" alt="Product 1">
           
          <div class="card-body">
            <h5 class="card-title">Jasmine</h5>
            <p class="card-text">Night Bloom Jasmine Plant</p>
            <p class="card-text">Price: ₹80</p>
            <div class="countdown-timer">
                <p>Offer ends in: 
                    <strong id="timer-1"></strong>
                </p>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card">
            
          <img src="img/a1.jpg" class="card-img-top" alt="Product 2">
          
            <div class="card-body">
            <h5 class="card-title">Flamingo lily</h5>
            <p class="card-text"> Flamingo Lily is a herbaceous evergreen plant</p>
            <p class="card-text">Price: ₹75</p>
            <div class="countdown-timer">
                <p>Offer ends in: 
                    <strong id="timer-2"></strong>
                </p>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card">
            
          <img src="img/a7.jpg" class="card-img-top" alt="Product 3">
            
          <div class="card-body">
            <h5 class="card-title">Peace lily</h5>
            <p class="card-text">Peace lily a very popular indoor house plant of the family Araceae</p>
            <p class="card-text">Price: ₹100</p>
            <div class="countdown-timer">
                <p>Offer ends in: 
                    <strong id="timer-3"></strong>
                </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
   
  <jsp:include page="footer.jsp" />


    <script>
        // Set the date for the offer end
var countDownDate = new Date("May 24, 2023 15:37:25").getTime();

// Update the count down every 1 second
var x = setInterval(function() {

  // Get the current date and time
  var now = new Date().getTime();

  // Calculate the distance between now and the count down date
  var distance = countDownDate - now;

  // Calculate the days, hours, minutes and seconds remaining
  var days = Math.floor(distance / (1000 * 60 * 60 * 24));
  var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
  var seconds = Math.floor((distance % (1000 * 60)) / 1000);

  // Display the remaining time in the special offer section
  document.getElementById("timer-1").innerHTML = days + "d " + hours + "h " + minutes + "m " + seconds + "s";
  document.getElementById("timer-2").innerHTML = days + "d " + hours + "h " + minutes + "m " + seconds + "s";
  document.getElementById("timer-3").innerHTML = days + "d " + hours + "h " + minutes + "m " + seconds + "s";

  // If the count down is finished, display a message
  if (distance < 0) {
    clearInterval(x);
    document.getElementById("timer-1").innerHTML = "EXPIRED";
    document.getElementById("timer-2").innerHTML = "EXPIRED";
    document.getElementById("timer-3").innerHTML = "EXPIRED";
  }
}, 1000);
</script>




      <!-- jQuery -->
      <script src="js/jquery.min.js"></script>
      <!-- Bootstrap JS -->
      <script src="js/bootstrap.bundle.min.js"></script>
      <!-- Custom JS -->
      <script>
         $(document).ready(function(){
             // Add smooth scrolling to all links
             $("a").on('click', function(event) {
         
                 // Make sure this.hash has a value before overriding default behavior
                 if (this.hash !== "") {
                     // Prevent default anchor click behavior
                     event.preventDefault();
         
                     // Store hash
                     var hash = this.hash;
         
                     // Using jQuery's animate() method to add smooth page scroll
                     // The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area
                     $('html, body').animate({
                         scrollTop: $(hash).offset().top
                     }, 800, function(){
              
                         // Add hash (#) to URL when done scrolling (default click behavior)
                         window.location.hash = hash;
                     });
                 } // End if
             });
         });
      </script>
      <script>
    const stars = document.querySelectorAll('.star-rating input');

stars.forEach(star => {
  star.addEventListener('click', function() {
    const rating = this.value;
    for (let i = 1; i <= rating; i++) {
      document.getElementById(`star${i}`).checked = true;
    }
    for (let i = parseInt(rating) + 1; i <= 5; i++) {
      document.getElementById(`star${i}`).checked = false;
    }
  });
});

</script>
   </body>
</html>