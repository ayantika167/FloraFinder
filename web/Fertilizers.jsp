<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <title>Plants</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/product.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha384-22W8+mcDa9Ll1n0VL87Obgw+2Qlzv/yJILN7czfHgJNjNiq8Swv/A9hY0D/soXDY" crossorigin="anonymous">
    </head>
    <body>
        <%@include file="nav1.jsp" %>





        <style type="text/css">
            * {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  background: linear-gradient(to bottom right, #a7c6d6, #f1f1f1);
}

div.productItemList {
  padding: 25px;
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  grid-template-rows: 420px;
  grid-auto-rows: 420px;
  gap: 15px;
}

div.productItemList div.productItem {
  width: 100%;
  height: 100%;
  border: 1px solid #ddd;
  border-radius: 10px;
  overflow: hidden;
  box-shadow: 0 0 15px -5px rgba(150, 170, 180, 0.25);
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: 1fr 150px auto 65px;
  position: relative;
  transition: transform 0.3s ease;
}

div.productItemList div.productItem:hover {
  transform: scale(1.05);
}

div.productItemList div.productItem .note {
  position: absolute;
  inset: 5px auto auto 5px;
  margin: 5px;
  padding: 5px 10px;
  background-color: dodgerblue;
  color: #fff;
  border-radius: 5px;
}

div.productItemList div.productItem div.itemImage {
  display: grid;
  place-items: center;
  border-bottom: 1px solid #ddd;
}

div.productItemList div.productItem div.itemImage img {
  max-width: 150px;
  aspect-ratio: 1/1;
  transition: transform 0.3s ease;
}

div.productItemList div.productItem:hover div.itemImage img {
  transform: scale(1.2);
}

div.productItemList div.productItem div.itemDesc {
  padding: 10px;
}

div.productItemList div.productItem div.itemDesc h2 {
  font-weight: normal;
  color: black;
}

div.productItemList div.productItem div.itemDesc h3 {
  color: royalblue;
}

div.productItemList div.productItem div.qnt {
  padding: 5px 10px;
}

div.productItemList div.productItem div.itemButton {
  display: flex;
  justify-content: flex-end;
  padding: 15px;
  gap: 10px;
  padding-top: 10px;
}

div.productItemList div.productItem div.itemButton button {
  padding: 10px 15px;
  width: auto;
  background-color: royalblue;
  color: #fff;
  border: 0;
  outline: 0;
  border-radius: 3px;
  font-weight: bold;
}

div.productItemList div.productItem div.itemButton button:hover {
  box-shadow: 0 5px 10px -5px royalblue;
}

div.productItemList div.productItem div.itemButton button a {
  color: #fff;
  font-weight: bold;
}

div.productItemList div.productItem div.qnt label {
  color: black;
}

div.productItemList div.productItem div.qnt input {
  color: black;
}

div.productItemList div.productItem div.itemDesc p {
  color: black;
}
div.productItemList div.productItem {
  position: relative;
  border: 2px solid transparent;
  /* Other styles... */
}

div.productItemList div.productItem::before {
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  border: 2px solid;
  z-index: -1;
  animation: borderAnimation 5s infinite;
}

@keyframes borderAnimation {
  0% {
    border-color: currentColor;
  }
  25% {
    border-color: #ff0000;
  }
  50% {
    border-color: #00ff00;
  }
  75% {
    border-color: #0000ff;
  }
  100% {
    border-color: currentColor;
  }
}

            </style>
<form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Flower Crops&pprice=1230">
            <!-- Product card holder -->
            <div class="productItemList">
            <!-- Product card -->
            <div class="productItem">
                <span class="note">New Arrival</span>
                <div class="itemImage">
                    <img src="img/b1.jpg" />
                </div>
                <div class="itemDesc">
                    <h2>Flower Crops</h2>
                    <h3>₹1230</h3>
                    <p>Flower Crops Cultivation And Management by Singh And A K, New India Publishing Agency</p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1">
                </div>
                <div class="itemButton">
                    <button type="submit">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
</form>
            <!-- Product card -->

            <!-- Product card -->
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Growing Flowers&pprice=1100">
            <div class="productItem">
                <span class="note">Out Of stock</span>
                <div class="itemImage">
                    <img src="img/b2.jpg" />
                </div>
                <div class="itemDesc">
                    <h2>Growing Flowers</h2>
                    <h3>₹1100</h3>
                    <p>Growing Flowers - by Niki Irving (Hardcover)</p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1">
                </div>
                <div class="itemButton">
                    <button type="submit">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
            </form>
            <!-- Product card -->

            <!-- Product card -->
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Indian Garden Flowers&pprice=1500">
            <div class="productItem">

                <div class="itemImage">
                    <img src="img/b3.jpg" />
                </div>
                <div class="itemDesc">
                    <h2>Indian Garden Flowers</h2>
                    <h3>₹1500</h3>
                    <p>Home Gardeners’ Guide Indian Garden Flowers- by Amarjeet Singh Batth</p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1">
                </div>
                <div class="itemButton">
                    <button type="submit">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
            </form>
            <!-- Product card -->

            <!-- Product card -->
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Cut Flower Garden&pprice=1450">
            <div class="productItem">

                <div class="itemImage">
                    <img src="img/b4.jpg" />
                </div>
                <div class="itemDesc">
                    <h2>Cut Flower Garden</h2>
                    <h3>₹1450</h3>
                    <p>Floret Farm's Cut Flower Garden: Garden Journal </p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1">
                </div>
                <div class="itemButton">
                    <button type="submit">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
            </form>
            <!-- Product card -->

            <!-- Product card -->
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Algo Plus&pprice=152">
            <div class="productItem">


                <div class="itemImage">
                    <img src="img/f1.jpg" />
                </div>
                <div class="itemDesc">
                    <h2>Algo Plus</h2>
                    <h3>₹152</h3>
                    <p>Algoplus Fertilizer Houseplant Formula - Single</p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1" onchange="updatePrice('quantity4')" />
                </div>
                <div class="itemButton">
                    <button type="submit">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
            </form>
            <!-- Product card -->

            <!-- Product card -->
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Flower Booster&pprice=292">
            <div class="productItem">


                <div class="itemImage">
                    <img src="img/f2.jpg" />
                </div>
                <div class="itemDesc">
                    <h2>Flower Booster</h2>
                    <h3>₹292</h3>
                    <p>Flower Booster - Provides All Essential Multi Micro nutrients for All Flowering Plants</p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1">
                </div>
                <div class="itemButton">
                    <button type="submit">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
            </form>
            <!-- Product card -->

            <!-- Product card -->
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Organic Hibiscus&pprice=221">
            <div class="productItem">

                <div class="itemImage">
                    <img src="img/f3.jpg" />
                </div>
                <div class="itemDesc">
                    <h2>Organic Hibiscus</h2>
                    <h3>₹221</h3>
                    <p>Home of Love Organic Hibiscus Plant Fertilizer For Flowering & Strong Roots</p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1">
                </div>
                <div class="itemButton">
                    <button type="submit">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
            </form>
            <!-- Product card -->

            <!-- Product card -->
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Parle Ropvatika&pprice=300">
            <div class="productItem">

                <div class="itemImage">
                    <img src="img/f4.jpg" />
                </div>
                <div class="itemDesc">
                    <h2>Parle Ropvatika</h2>
                    <h3>₹300</h3>
                    <p>Parle Ropvatika Flower Booster - Flowering Stimulant - Plant Growth Booster</p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1">
                </div>
                <div class="itemButton">
                    <button type="button">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
            </form>
            <!-- Product card -->



            <!-- Product card -->

            <!-- Product card -->
        </div>
        <!-- Product card holder -->
        <script>
            function updatePrice(quantityId) {
                // Get the quantity input element
                var quantityInput = document.getElementById(quantityId);

                // Get the corresponding item price element
                var priceElement = quantityInput.parentNode.querySelector('.itemPrice');

                // Calculate the new price based on the quantity
                var newPrice = parseInt(quantityInput.value) * 50;

                // If the quantity is 4 or more, set the new price to 4 times the initial price
                if (parseInt(quantityInput.value) >= 1) {
                    newPrice = parseInt(quantityInput.value) * 50;
                }

                // Set the new price in the item price element
                priceElement.textContent = newPrice;
            }

        </script>
    </body>
</html>