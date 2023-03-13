<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품</title>
<style>
	main {
		width: 50%;
		margin: 0 auto;
	}
	
	table {
		width: 100%;
		margin: 0 auto;
	}
</style>
</head>
<body>
	<main>
		<h1>상품 관리</h1>
		<!-- 추가 -->
		<div style="width: 100%; text-align: right">
			<a href="javascript:view()">추가</a>
			<div class="input-wrap" style="width: 100%; text-align: center; display: none; margin-bottom: 30px;">
				<input type="text" name="productName" placeholder="상품 이름">
				<input type="text" name="productPrice" placeholder="상품 가격">
				<input type="text" name="productStock" placeholder="상품 재고">
				<input type="button" value="상품 등록" style="width: 70%" onclick="insert()">
			</div>
			<div id="products"></div>
			<!-- 목록 -->
			<!-- 상품별 수정, 삭제 -->
		</div>
	</main>
</body>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script>
	let count = 1;
	show();
	
	function show(){
		$.ajax({
			url: "${pageContext.request.contextPath}/list.prod",
			dataType: "json",
			success: function(products){
				let text = "";
				text += `<table border="1">`;
				text += `<tr>`
				text += `<th>상품 번호</th>`;
				text += `<th>상품 이름</th>`;
				text += `<th>상품 가격</th>`;
				text += `<th>상품 재고</th>`;
				text += `<th colspan="2">서비스</th>`;
				text += `</tr>`
				products.forEach(product => {
					text += `<tr>`
					text += `<td>` + product.productNumber + `</td>`;
					text += `<td>` + product.productName + `</td>`;
					text += `<td>` + product.productPrice + `</td>`;
					text += `<td>` + product.productStock + `</td>`;
					text += `<td><a href="javascript:void(0);">수정</a></td>`;
					text += `<td><a href="javascript:void(0);">삭제</a></td>`;
					text += `</tr>`
				});
				text += `</table>`;
				
				$("#products").html(text);
			}
		});
	}
	
	function view(){
		$(".input-wrap").slideToggle(function(){
			count *= -1;
			$(this).prev().text(count > 0 ? "추가" : "닫기");
		});
	}
	
	function insert(){
		const $productNameInput = $("input[name='productName']");
		const $productPriceInput = $("input[name='productPrice']");
		const $productStockInput = $("input[name='productStock']");
		
		if(!$productNameInput.val()){
			$productNameInput.focus();
			return;
		}
		if(!$productPriceInput.val()){
			$productPriceInput.focus();
			return;
		}
		if(!$productStockInput.val()){
			$productStockInput.focus();
			return;
		}
		
		$.ajax({
			url: "${pageContext.request.contextPath}/create.prod",
			type: "post",
			data: {productName: $productNameInput.val(), productPrice: $productPriceInput.val(), productStock: $productStockInput.val()},
			success: function(){
				$productNameInput.val("");
				$productPriceInput.val("");
				$productStockInput.val("");
				show();
			}
		});
		
	}
</script>
</html>




