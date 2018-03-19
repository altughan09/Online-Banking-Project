<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bank.css">
	<link href="https://fonts.googleapis.com/css?family=Archivo+Narrow:400,700" rel="stylesheet">
	<script  src="https://code.jquery.com/jquery-3.3.1.min.js"  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="  crossorigin="anonymous"></script>
	<title>Online Banking System</title>
</head>
<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);

	if (session.getAttribute("session") == null)
		response.sendRedirect("welcome.jsp");
%>
<body>
<div class="header">
	<a href="successful.html"><img src="${pageContext.request.contextPath}/resources/assets/logo.png" width="100" height="100"></a>
	<marquee style="color: #FFFFFF" bgcolor="#000080" scrollamount="10">1 EUR = 4,3540 -- 1 USD = 3,5043 --  1 CHF = 3,7740 --  1 GBP = 4,8990</marquee>
</div>
  <div class="menubar">
    <ul>
      <li><a href="successful.html">DASHBOARD</a></li>
      <li><a href="#">YOUR PRODUCTS</a></li>
      <li><a href="#">TRANSFERS &#38; PAYMENTS</a></li>
      <li><a href="#">HISTORY</a></li>
      <li><a href="#">BANK OFFER</a></li>
      <li><a href="#">CUSTOMER SERVICE</a></li>
      <li class="logout"><a href="#">LOGOUT</a></li>

    </ul>
  </div>
<p>Customer number: ${customerID}</p>
<div class="box green">
<c:forEach var="account" items="${theAccount}">
					Account Number <div id="val">${account.accountNumber}</div>
					Your Balance(z&#322;)<div class="counter" data-count="${account.accountBalance}">0</div>
</c:forEach>
</div>
<div class="box green">
Transaction History
</div>
<script type="text/javascript">
		$('.counter').each(function() {
		var $this = $(this),
		countTo = $this.attr('data-count');
			  
	    $({ countNum: $this.text()}).animate({
			countNum: countTo
			},

			{

			duration: 2000,
			 easing:'linear',
			 step: function() {
			 $this.text(Math.floor(this.countNum));
			 },
			 complete: function() {
			  $this.text(this.countNum);
			    }

			  });  
			  
			});
	</script>
</body>
</html>