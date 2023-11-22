<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dao.ProductRepository"%>

<%! String greeting = "냥이 공간에 온것을 환영한다냥";%>
	<div class="container">
	<div class="jumbotron">
		<div class="container">
			<h3 class="display-4">
				<%=greeting%>
            </h3>
		</div>
	</div>
    </div>
<%
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
%>

    <div class="container">
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
                    <div class="card bg-dark text-white">
                        <img src="image/product/<%=product.getFilename()%>" class="card-img" alt="...">
                        <div class="main-img-overlay">
                        <h5 class="main-title">사료, 간식, 장난감 샘플</h5>
                        <p class="main-text">출처 : 구글 검색</p>
                        </div>
                        </div>
				<h3><%=product.getPname()%></h3> <!--상품 이름 -->
				<p><%=product.getDescription()%> <!-- 상품 정보-->
				<p><%=product.getUnitPrice()%>원 <!-- 상품 가격-->
                <p><a href="product_detail_ad.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상품 상세 정보 &raquo;</a>

			</div>
			<%
				} //반복문 끝
			%>
		</div>
		<hr>
	</div>

 <div class="card bg-white text-dark">
    <img src="image/main2.jpg" class="main-img" alt="...">
    <div class="main-img-overlay">
    <h5 class="main-title">메인 이미지</h5>
    <p class="main-text">출처 : pixabay</p>
  </div>
  </div>
<div class="list-group">
      <a href="#" class="list-group-item list-group-item-action active" aria-current="true">로얄캐닌 시리즈</a>
      <a href="#" class="list-group-item list-group-item-action">위스카스 시리즈</a>
      <a href="#" class="list-group-item list-group-item-action">쉬바 시리즈</a>
      <a href="#" class="list-group-item list-group-item-action">동원 시리즈</a>
    </div>
