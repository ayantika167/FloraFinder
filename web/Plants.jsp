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
    <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Calendula&pprice=110">
      <!-- Product card holder -->
        <div class="productItemList">
            <!-- Product card -->
            <div class="productItem">
                <span class="note">New Arrival</span>
                <div class="itemImage"><img src="img/calendula.jpg" /></div>
                <div class="itemDesc">
                    <h2>Calendula</h2>
                    <h3>₹110</h3>
                    <p>CosaCentrum Calendula live Orange English Flower Plant</p>
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
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Cosmos&pprice=109">
            <div class="productItem">

                <div class="itemImage"><img src="img/cosmos-flower-plant.jpg" /></div>
                <div class="itemDesc">
                    <h2>Cosmos</h2>
                    <h3 >₹109</h3>
                    <p>Planta Zee Live Yellow Cosmos Flower Plant - Suitable for Home/Garden </p>
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
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Daisy&pprice=89">
            <div class="productItem">

                <div class="itemImage"><img src="img/bellis-plant-white-flower-daisy.jpg" /></div>
                <div class="itemDesc">
                    <h2>Daisy</h2>
                    <h3>₹89</h3>
                    <p>WILLVINE ™ White English Daisy (Bellis perennis) </p>
                </div>
                <div class="qnt">
                    <label for="quantity4">Quantity:</label>
                    <input type="number" id="quantity4" name="quantity" value="1" min="1" >
                </div>
                <div class="itemButton">
                    <button type="submit">Add to cart</button>
                    <button type="button"><a href="payment.jsp" alt="#">Buy now</a></button>
                </div>
            </div>
            </form>
            <!-- Product card -->

            <!-- Product card -->
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Dahlia&pprice=75">
            <div class="productItem">

                <div class="itemImage"><img src="img/dahlia-flower-plant-any-color.jpg" /></div>
                <div class="itemDesc">
                    <h2>Dahlia</h2>
                    <h3>₹75</h3>
                    <p>Crapulous Dahlia flower plant for only home gardening </p>
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
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Gerbera&pprice=129">
            <div class="productItem">

                <div class="itemImage"><img src="img/gerbera.png" /></div>
                <div class="itemDesc">
                    <h2>Gerbera</h2>
                    <h3>₹129</h3>
                    <p>Greenery Nursery Gerbera Plant </p>
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
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Gladiolus&pprice=149">
            <div class="productItem">

                <div class="itemImage"><img src="img/gladiolus.jpg" /></div>
                <div class="itemDesc">
                    <h2>Gladiolus</h2>
                    <h3>₹149</h3>
                    <p>Cloud Farm Gladiolus/Sword Lily Plant  </p>
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
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Indigo&pprice=169">
            <div class="productItem">
                <span class="note">Out of Stock</span>
                <div class="itemImage"><img src="img/indigo.jpg" /></div>
                <div class="itemDesc">
                    <h2>Indigo</h2>
                    <h3>₹169</h3>
                    <p>Blue False Indigo Baptisia australis plant </p>
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
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Alstroemeria&pprice=139">
            <div class="productItem">

                <div class="itemImage"><img src="img/inka.jpg" /></div>
                <div class="itemDesc">
                    <h2>Alstroemeria</h2>
                    <h3>₹139</h3>
                    <p>Floriculture Greens Dwarf Imported Canna Lily Holy Flower Bulbs </p>
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
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Jasmin&pprice=189">
            <div class="productItem">

                <div class="itemImage"><img src="img/jasmin.jpg" /></div>
                <div class="itemDesc">
                    <h2>Jasmine</h2>
                    <h3>₹189</h3>
                    <p>Night Bloom Jasmine Plant </p>
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
            <form method="POST" action="http://localhost:8080/ecommerce/AddCart?pname=Lily&pprice=152">
            <div class="productItem">

                <div class="itemImage"><img src="img/lily.jpg" /></div>
                <div class="itemDesc">
                    <h2>Lily</h2>
                    <h3>₹152</h3>
                    <p>Peace Lily Plant Sapling </p>
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