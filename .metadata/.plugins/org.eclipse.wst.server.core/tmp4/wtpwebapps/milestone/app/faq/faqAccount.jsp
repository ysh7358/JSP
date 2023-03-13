<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="ko" data-direction="ltr">

<head>
    <meta name="robots" content="noindex, nofollow">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>MILESTONE+Help Center</title>
    <meta name="description" content="계정문의">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="intercom:trackingEvent"
        content="{&quot;name&quot;:&quot;Viewed Help Center&quot;,&quot;metadata&quot;:{&quot;action&quot;:&quot;viewed&quot;,&quot;object&quot;:&quot;educate_home&quot;,&quot;place&quot;:&quot;help_center&quot;,&quot;owner&quot;:&quot;educate&quot;,&quot;default_locale&quot;:&quot;en&quot;,&quot;current_locale&quot;:&quot;ko&quot;,&quot;is_default_locale&quot;:false}}">
    <meta property="og:title" content="CLASS101+Help Center">
    <meta name="twitter:title" content="CLASS101+Help Center">

    <meta property="og:description" content="계정문의">
    <meta name="twitter:description" content="계정문의">

    <meta property="og:type" content="website">
    <meta property="og:image"
        content="https://downloads.intercomcdn.com/i/o/334438/617f499e0dc747ca28c9c9d6/37f11ccece2351ec558f9bd873223a6f.png">

    <meta name="twitter:image"
        content="https://downloads.intercomcdn.com/i/o/334438/617f499e0dc747ca28c9c9d6/37f11ccece2351ec558f9bd873223a6f.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/faq/faqFourth.css" />
</head>

<body class="header__lite" style="">
    <header class="header">
        <div class="container header__container o__ltr" dir="ltr">
            <div class="content">
                <div class="mo o__centered o__reversed header__meta_wrapper">
                    <div class="mo__body header__site_name">
                        <div class="header__logo">
                            <a href="${pageContext.request.contextPath}/member/index.me">
                                <img alt="CLASS101+Help Center" height="347"
                                    src="${pageContext.request.contextPath}/assets/img/faq/whiteLogo.png">
                            </a>
                        </div>
                    </div>
                    <div class="mo__aside">
                        <div class="header__links">
                                    <g stroke="#FFF" fill="none" fill-rule="evenodd" stroke-linecap="round"
                                        stroke-linejoin="round">
                                        <path d="M11.5 6.73v6.77H.5v-11h7.615M4.5 9.5l7-7M13.5 5.5v-5h-5"></path>
                                    </g>
                                </svg><span></span></a>
                            <select name="locale-picker" id="locale-picker" class="locale-picker" data-locale="ko"
                                style="width: 82px;">
                                <option data-locale="ko" selected="selected"
                                    value="/class101faq/ko/collections/3422162-자주-묻는-질문">한국어</option>
                            </select><select name="hidden_locales" id="locale-picker-for-width-calculation"
                                class="locale-picker" style="">
                                <option value="">한국어</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <div class="container">
        <div class="content educate_content">
            <section class="content section">
                <div class="breadcrumb" dir="ltr">
                    <div class="link__arrow o__ltr">
                        <a href="javascript:void(0)">모든 컬렉션</a>
                    </div>

                    <div class="link__arrow o__ltr">계정문의</div>
                </div>

                <div class="section__bg">
                    <div class="paper g__space collection__headline">
                        <div class="collection o__ltr">
                            <div class="collection__photo">
                                <svg role="img" viewBox="0 0 48 48">
                                    <g id="user-edit" stroke-width="2" fill="none" fill-rule="evenodd">
                                        <path d="M34 45l-7 2 2-7 13-13 5 5-13 13z" stroke-linecap="round"
                                            stroke-linejoin="round"></path>
                                        <path d="M38 31l5 5" stroke-linejoin="round"></path>
                                        <path d="M29 40l5 5" stroke-linecap="round" stroke-linejoin="round"></path>
                                        <path
                                            d="M31 31.037L25 29v-5.843m-10 .373V29L4.98 32.577A6 6 0 0 0 1 38.227V43h21">
                                        </path>
                                        <path
                                            d="M29.75 13c0 6.627-4.48 12-10 12-5.523 0-10-5.373-10-12s4.477-12 10-12c5.52 0 10 5.373 10 12z">
                                        </path>
                                        <path
                                            d="M29.667 11.916c-.336.04-.58.018-.917.083-3.406.653-5.593-.58-7.468-3.86C20.157 10.293 16.64 12 13.75 12c-1.422 0-2.646-.292-3.87-.933">
                                        </path>
                                    </g>
                                </svg>
                            </div>
                            <div class="collection__meta intercom-force-break" dir="ltr">
                                <h1 class="t__h1">계정문의</h1>
                                <p class="paper__preview"></p>
                                <div class="avatar">
                                    <div class="avatar__photo avatars__images o__ltr">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/minilogo.jpg"
                                            alt="class101 avatar" class="avatar__image">
                                    </div>
                                    <div class="avatar__info">
                                        <div>
                                            <span class="c__darker">
                                                이 컬렉션의 7개 기사
                                            </span>
                                            <br>
                                            작성자: <span class="c__darker"> milestone</span>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="g__space">
                        <a href="javascript:void(0)"
                            class="t__no-und paper paper__article-preview">
                            <div class="article__preview intercom-force-break" dir="ltr">
                                <nav class="nav">
                                    <h2 class="t__h3"><span class="c__primary">회원가입은 어떻게 할 수 있나요?</span></h2>
                                    <div id="sliding_menu">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/logo.png" style="width: 12%"> 
                                        <p></p>
                                        안녕하세요. MILESTONE 팀입니다.
                                        <br>
                                        <br>
                                        by MILESTONE PROJECT FAQ
                                     </div>
                                 </nav>
                                <span class="paper__preview c__body"></span>
                                <div class="avatar">
                                    <div class="avatar__photo o__ltr">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/minilogo.jpg"
                                            alt="class101 avatar" class="avatar__image">

                                    </div>
                                    <div class="avatar__info">
                                        <div>
                                            <span class="c__darker">작성자:</span>milestone
                                            <br> 1주일 전에 업데이트됨
                                        </div>
                                    </div>
                                </div>

                            </div>

                        </a>
                        <a href="javascript:void(0)"
                            class="t__no-und paper paper__article-preview">
                            <div class="article__preview intercom-force-break" dir="ltr">
                                <nav class="nav">
                                    <h2 class="t__h3"><span class="c__primary">가입한 계정을 찾을 수 없어요.</span></h2>
                                    <div id="sliding_menu">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/logo.png" style="width: 12%"> 
                                        <p></p>
                                        안녕하세요. MILESTONE 팀입니다.
                                        <br>
                                        상단에 있는 로그인 > 아이디 찾기 기능을 이용해 보시기 바랍니다. 감사합니다.
                                        <br>
                                        <br>
                                        by MILESTONE PROJECT FAQ
                                     </div>
                                 </nav>
                                <span class="paper__preview c__body"></span>
                                <div class="avatar">
                                    <div class="avatar__photo o__ltr">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/minilogo.jpg"
                                            alt="class101 avatar" class="avatar__image">

                                    </div>
                                    <div class="avatar__info">
                                        <div>
                                            <span class="c__darker">작성자:</span>milestone
                                            <br> 1주일 전에 업데이트됨
                                        </div>
                                    </div>
                                </div>

                            </div>

                        </a>
                        <a href="javascript:void(0)"
                            class="t__no-und paper paper__article-preview">
                            <div class="article__preview intercom-force-break" dir="ltr">
                                <nav class="nav">
                                    <h2 class="t__h3"><span class="c__primary">비밀번호가 생각나지 않아요.</span></h2>
                                    <div id="sliding_menu">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/logo.png" style="width: 12%"> 
                                        <p></p>
                                        안녕하세요. MILESTONE 팀입니다.
                                        <br>
                                        상단에 있는 로그인 > 비밀번호 찾기 기능을 이용해 보시기 바랍니다. 감사합니다.
                                        <br>
                                        <br>
                                        by MILESTONE PROJECT FAQ
                                     </div>
                                 </nav>
                                <span class="paper__preview c__body"></span>
                                <div class="avatar">
                                    <div class="avatar__photo o__ltr">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/minilogo.jpg"
                                            alt="class101 avatar" class="avatar__image">

                                    </div>
                                    <div class="avatar__info">
                                        <div>
                                            <span class="c__darker">작성자:</span>milestone
                                            <br> 1주일 전에 업데이트됨
                                        </div>
                                    </div>
                                </div>

                            </div>

                        </a>
                        <a href="javascript:void(0)"
                            class="t__no-und paper paper__article-preview">
                            <div class="article__preview intercom-force-break" dir="ltr">
                                <nav class="nav">
                                    <h2 class="t__h3"><span class="c__primary">다른 계정에서 이용하고 싶어요.</span></h2>
                                    <div id="sliding_menu">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/logo.png" style="width: 12%"> 
                                        <p></p>
                                        안녕하세요. MILESTONE 팀입니다.
                                        <br>
                                        로그아웃 후 다른 계정으로 로그인하시면 됩니다. 감사합니다.
                                        <br>
                                        <br>
                                        by MILESTONE PROJECT FAQ
                                     </div>
                                 </nav>
                                <span class="paper__preview c__body"></span>
                                <div class="avatar">
                                    <div class="avatar__photo o__ltr">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/minilogo.jpg"
                                            alt="class101 avatar" class="avatar__image">

                                    </div>
                                    <div class="avatar__info">
                                        <div>
                                            <span class="c__darker">작성자:</span>milestone
                                            <br> 1주일 전에 업데이트됨
                                        </div>
                                    </div>
                                </div>

                            </div>

                        </a>
                        <a href="javascript:void(0)"
                            class="t__no-und paper paper__article-preview">
                            <div class="article__preview intercom-force-break" dir="ltr">
                                <nav class="nav">
                                    <h2 class="t__h3"><span class="c__primary">회원 정보를 변경하고 싶어요.</span></h2>
                                    <div id="sliding_menu">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/logo.png" style="width: 12%"> 
                                        <p></p>
                                        안녕하세요. MILESTONE 팀입니다.
                                        <br>
                                        상단에 있는 마이페이지에서 변경 가능합니다. 감사합니다.
                                        <br>
                                        <br>
                                        by MILESTONE PROJECT FAQ
                                     </div>
                                 </nav>
                                <span class="paper__preview c__body"></span>
                                <div class="avatar">
                                    <div class="avatar__photo o__ltr">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/minilogo.jpg"
                                            alt="class101 avatar" class="avatar__image">

                                    </div>
                                    <div class="avatar__info">
                                        <div>
                                            <span class="c__darker">작성자:</span>milestone
                                            <br> 1주일 전에 업데이트됨
                                        </div>
                                    </div>
                                </div>

                            </div>

                        </a>
                        <a href="javascript:void(0)"
                            class="t__no-und paper paper__article-preview">
                            <div class="article__preview intercom-force-break" dir="ltr">
                                <nav class="nav">
                                    <h2 class="t__h3"><span class="c__primary">탈퇴 방법을 알고 싶어요.</span></h2>
                                    <div id="sliding_menu">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/logo.png" style="width: 12%"> 
                                        <p></p>
                                        안녕하세요. MILESTONE 팀입니다.
                                        <br>
                                        회원탈퇴는 상단의 마이페이지에서 하실 수 있습니다. 감사합니다.
                                        <br>
                                        <br>
                                        by MILESTONE PROJECT FAQ
                                     </div>
                                 </nav>
                                <span class="paper__preview c__body"></span>
                                <div class="avatar">
                                    <div class="avatar__photo o__ltr">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/minilogo.jpg"
                                            alt="class101 avatar" class="avatar__image">

                                    </div>
                                    <div class="avatar__info">
                                        <div>
                                            <span class="c__darker">작성자:</span>milestone
                                            <br> 1주일 전에 업데이트됨
                                        </div>
                                    </div>
                                </div>

                            </div>

                        </a>
                        <a href="javascript:void(0)"
                            class="t__no-und paper paper__article-preview">
                            <div class="article__preview intercom-force-break" dir="ltr">
                                <nav class="nav">
                                    <h2 class="t__h3"><span class="c__primary">문자, 알림톡 설정을 변경하고 싶어요.</span></h2>
                                    <div id="sliding_menu">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/logo.png" style="width: 12%"> 
                                        <p></p>
                                        안녕하세요. MILESTONE 팀입니다.
                                        <br>
                                        <br>
                                        by MILESTONE PROJECT FAQ
                                     </div>
                                 </nav>
                                <span class="paper__preview c__body"></span>
                                <div class="avatar">
                                    <div class="avatar__photo o__ltr">
                                        <img src="${pageContext.request.contextPath}/assets/img/faq/minilogo.jpg"
                                            alt="class101 avatar" class="avatar__image">

                                    </div>
                                    <div class="avatar__info">
                                        <div>
                                            <span class="c__darker">작성자:</span>milestone
                                            <br> 1주일 전에 업데이트됨
                                        </div>
                                    </div>
                                </div>

                            </div>

                        </a>
                    </div>


                </div>
            </section>
        </div>
    </div>
    <footer class="footer">
        <div class="container">
            <div class="content">
                <div class="u__cf" dir="ltr">
                    <div class="footer__logo">
                        <a href="/class101faq/ko/">
                            <img alt="CLASS101+Help Center"
                                src="${pageContext.request.contextPath}/assets/img/faq/mainlogo.png">
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</body>
    <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/faq/faq.js" ></script>
    <script type="text/javascript"></script>

</html>