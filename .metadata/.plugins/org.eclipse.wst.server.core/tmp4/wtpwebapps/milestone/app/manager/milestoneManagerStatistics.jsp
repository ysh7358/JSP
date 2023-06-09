<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>이정표 | 관리자페이지</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/manager/mileStoneManager_all_css.css">
</head>

<body onload="showClock()">
	<!-- 사이드 -->
	<div id='sidebar'>
		<div id='sidebar_header'>
			<a
				href="${pageContext.request.contextPath}/management/managerDonateHistory.don"
				id="mileStoneLogo"> </a>
		</div>
		<div id="sidebar_menu">
			<div id="sidebar_menu_wrapper">
				<div class="menu menu_colum">
					<!-- 대시 보드 -->
					<div class="menu_item">
						<span class="menu-link"> <span class="menu-icon"> <span
								id="dashboard-icon-img"></span>
						</span> <span class="menu-title">대시보드</span> <span class="menu-arrow">
								<span class="arrow-icon"></span>
						</span>
						</span>
						<div class="menu-sub">
							<%-- <div class="menu-item">
								<a class="menu-link active"
									href="${pageContext.request.contextPath}/member/statistics.me">
									<span class="menu-bullet"> <span class="bullet"></span>
								</span> <span class="menu-title">이용자 통계</span>
								</a>
							</div> --%>
							<div class="menu-item">
								<a class="menu-link active"
									href="${pageContext.request.contextPath}/management/managerDonateHistory.don">
									<span class="menu-bullet"> <span class="bullet"></span>
								</span> <span class="menu-title">기부 내역</span>
								</a>
							</div>
						</div>

					</div>
					<div class="menu-item pt-5">
						<div class="menu-content">
							<span class="menu-heading">페이지</span>
						</div>
					</div>
					<!-- 사용자 관리 -->
					<div class="menu_item">
						<span class="menu-link"> <span class="menu-icon"> <span
								id="user-icon-img"></span>
						</span> <span class="menu-title">사용자 관리</span> <span class="menu-arrow">
								<span class="arrow-icon"></span>
						</span>
						</span>
						<div class="menu-sub">
							<div class="menu-item">
								<a class="menu-link active"
									href="${pageContext.request.contextPath}/management/userList.me">
									<span class="menu-bullet"> <span class="bullet"></span>
								</span> <span class="menu-title">사용자 목록</span>
								</a>
							</div>
						</div>

					</div>
					<!-- 커뮤니티 관리 -->
					<div class="menu_item">
						<span class="menu-link"> <span class="menu-icon"> <span
								id="coumunity-icon-img"></span>
						</span> <span class="menu-title">커뮤니티 관리</span> <span class="menu-arrow">
								<span class="arrow-icon"></span>
						</span>
						</span>
						<div class="menu-sub">
							<div class="menu-item">
								<a class="menu-link active"
									href="${pageContext.request.contextPath}/management/communityManager.manager">
									<span class="menu-bullet"> <span class="bullet"></span>
								</span> <span class="menu-title">게시글 목록</span>
								</a>
							</div>
						</div>

					</div>
					<%-- <!-- 기부 일정 관리 -->
					<div class="menu_item">
						<span class="menu-link"> <span class="menu-icon"> <span
								id="schedule-icon-img"></span>
						</span> <span class="menu-title">기부 일정 관리</span> <span class="menu-arrow">
								<span class="arrow-icon"></span>
						</span>
						</span>
						<div class="menu-sub">
							<div class="menu-item">
								<a class="menu-link active"
									href="${pageContext.request.contextPath}/management/managerDonateHistory.don">
									<span class="menu-bullet"> <span class="bullet"></span>
								</span> <span class="menu-title">기부 일정 달력</span>
								</a>
							</div>
						</div>
					</div> --%>
					<!-- 고객지원 -->
					<div class="menu_item">
						<span class="menu-link"> <span class="menu-icon"> <span
								id="supportGuest-icon-img"></span>
						</span> <span class="menu-title">공지사항</span> <span class="menu-arrow">
								<span class="arrow-icon"></span>
						</span>
						</span>
						<div class="menu-sub">
							<div class="menu-item">
								<a class="menu-link active"
									href="${pageContext.request.contextPath}/management/managerNoticeListOk.notice">
									<span class="menu-bullet"> <span class="bullet"></span>
								</span> <span class="menu-title">공지사항 관리</span>
								</a>
							</div>
							<%-- <div class="menu-item">
								<a class="menu-link active"
									href="${pageContext.request.contextPath}/management/banner.banners">
									<span class="menu-bullet"> <span class="bullet"></span>
								</span> <span class="menu-title">배너 관리</span>
								</a>
							</div> --%>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 헤더 -->
	<header>
		<div id="header">
			<a href="https://playwarcraft3.com/ko-kr/" class="banner"></a>
			<div id="toolBox">
				<div id="divClock" class="clock"></div>
				<div>관리자님 환영합니다.</div>
			</div>
		</div>
	</header>
	<!-- 메인 -->
	<main>
		<div class="main">
			<div id="toolbar">
				<div id="toolbarTitle">
					<span id="toolbarTitleText">이용자 통계</span> <span
						id="toolbarTitleSub">홈 - 대시보드 - 이용자 통계</span>
				</div>
			</div>
			<!-- 메인 컨텐츠 -->
			<div id="content-container">
				<div class="row-content-container">
					<!-- 종합, 보육원 세로 그래프 -->
					<div class="colum-content-container">
						<div class="cardAll card4of1">
							<div class="card-header-chart">
								<div class="card-title-chart">
									<div class="flex-card-Title">
										<span class="card-Title-value">2477명</span>
									</div>
									<span class="card-Title-text">일일 종합 방문자수 비율</span>
								</div>
							</div>
							<div class="card-body-chart">
								<div id="synthesisPieChart" style="width: 90px; height: 90px;"></div>
								<div class="chart-legend-colum">
									<div class="chart-legend-flex">
										<div class="bullet chart-legned-bullet general"></div>
										<div class="chart-legend-flex-text">일반 회원</div>
										<div class="chart-legend-flex-value">456명</div>
									</div>
									<div class="chart-legend-flex">
										<div class="bullet chart-legned-bullet nurserySchool"></div>
										<div class="chart-legend-flex-text">보육원 회원</div>
										<div class="chart-legend-flex-value">150명</div>
									</div>
									<div class="chart-legend-flex">
										<div class="bullet chart-legned-bullet nonMember"></div>
										<div class="chart-legend-flex-text">비회원</div>
										<div class="chart-legend-flex-value">1871명</div>
									</div>

								</div>
							</div>
						</div>
						<div class="cardAll card4of1">
							<div class="card-header-chart">
								<div class="card-title-chart">
									<div class="flex-card-Title">
										<span class="card-Title-value">150명</span>
									</div>
									<span class="card-Title-text">일일 보육원회원 방문수</span>
								</div>
							</div>
							<div class="card-body-chart">
								<div id="nurserySchoolLineChart"
									style="width: 100%; height: 160px"></div>
								<div class="chart-legend-colum"></div>
							</div>

						</div>
					</div>
					<!-- 일반회원, 비회원 세로 그래프 -->
					<div class="colum-content-container">
						<div class="cardAll card4of1">
							<div class="card-header-chart">
								<div class="card-title-chart">
									<div class="flex-card-Title">
										<span class="card-Title-value">456명</span>
									</div>
									<span class="card-Title-text">일일 일반회원 방문수</span>
								</div>
							</div>
							<div class="card-body-chart">
								<div id="generalLineChart" style="width: 100%; height: 160px"></div>
							</div>
						</div>
						<div class="cardAll card4of1">
							<div class="card-header-chart">
								<div class="card-title-chart">
									<div class="flex-card-Title">
										<span class="card-Title-value">1871명</span>
									</div>
									<span class="card-Title-text">일일 비회원 방문수</span>
								</div>
							</div>
							<div class="card-body-chart">
								<div id="nonMemberLineChart" style="width: 100%; height: 160px"></div>
							</div>
						</div>
					</div>
					<!-- 종합 방문수 그래프 -->
					<div class="colum-content-container">
						<div class="cardAll card1of1">
							<div class="card-header-chart">
								<div class="card-title-chart">
									<div class="flex-card-Title">
										<span class="card-Title-1of1">통계</span>
									</div>
									<span class="card-Title-text">종합 방문자수</span>
								</div>
								<div class="card-toolbar-chart">
									<div class="select-dayormonth"></div>
								</div>
							</div>
							<div class="card-body-1of1">
								<div class="card-body-title">
									<div class="card-title-value-1of1">2477명</div>
									<span class="card-Title-text">일일 방문자수</span>
								</div>
								<div class="chart-wrap">
									<div id="synthesisLineChart" style="width: 100%; height: 100%"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 푸터 -->
			<footer>
				<div id="footer-logo-box">

					<div id="footer-flex">

						<a href="${pageContext.request.contextPath}/member/index.me">
							<div id="footer-logo"></div>
						</a>
						<div id="footer-company">2022© 동석한 아카데미 Team 4</div>
					</div>
				</div>
				<div id="footer-flex">
					<div id="footer-menu">이용약관 · 개인정보 처리방침 · 이용약관 · 사업자 정보 확인 ·
						제휴/협력 · 문의 단체/기업 교육 문의</div>
					<div id="footer-company-info">대표 김의엽 | 서울 강남구 테헤란로 146
						3층(역삼동) | T4@.inc | 전화번호: 1234-1234 |</div>

				</div>
			</footer>
		</div>
	</main>

</body>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<script>
	var jb = jQuery.noConflict();
</script>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/manager/mileStoneManager_public.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/manager/mileStoneManager_statistics.js"></script>

</html>