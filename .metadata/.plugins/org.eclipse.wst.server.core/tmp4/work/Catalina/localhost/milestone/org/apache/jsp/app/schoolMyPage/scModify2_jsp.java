/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-21 02:07:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.schoolMyPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class scModify2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>게시판</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("   href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/myPage/modify.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("   href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/myPage/profile.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin: 0px;\">\r\n");
      out.write("\r\n");
      out.write("   <div id=\"modifySchool\">\r\n");
      out.write("      <header>\r\n");
      out.write("         <div id=\"headerBox\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/schoolMyPage/logo.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"search_box\">\r\n");
      out.write("               <input id=\"searchInput\" type=\"text\" placeholder=\"정을 옮기는 이정표입니다\">\r\n");
      out.write("               <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/schoolMyPage/search.png\">\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"user\">\r\n");
      out.write("               <span style=\"cursor: pointer;\"> <svg\r\n");
      out.write("                     xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\"\r\n");
      out.write("                     class=\"css-uxrfz2\">\r\n");
      out.write("                        <path\r\n");
      out.write("                        d=\"M21.141 3.91A6.262 6.262 0 0 0 16.654 2c-1.621 0-3.252.635-4.488 1.91-.06.06-.11.125-.165.19-.055-.06-.105-.13-.165-.19A6.263 6.263 0 0 0 7.35 2c-1.621 0-3.252.635-4.488 1.91-2.481 2.545-2.481 6.67 0 9.21l8.935 8.79c.06.06.135.09.21.09.075 0 .15-.03.21-.09l8.935-8.79c2.467-2.54 2.467-6.665-.01-9.21Zm-1.78 7.35-7.37 7.245-7.369-7.245c-1.47-1.525-1.466-3.99.015-5.51A3.73 3.73 0 0 1 7.33 4.605c1.005 0 2.19.505 2.996 1.25.73.68 1.066 1.235 1.361 1.655.03.045.125.215.3.215s.27-.175.305-.22c.296-.425.63-.975 1.356-1.655.806-.75 1.991-1.25 2.997-1.25a3.74 3.74 0 0 1 2.696 1.145c1.486 1.525 1.491 3.99.02 5.514Z\"\r\n");
      out.write("                        class=\"css-17ivn46\"></path>\r\n");
      out.write("                    </svg>\r\n");
      out.write("               </span>\r\n");
      out.write("               <div style=\"width: 20px;\"></div>\r\n");
      out.write("               <div id=\"userWrap\">\r\n");
      out.write("                  <picture class=\"userIcon\">\r\n");
      out.write("                  <source type=\"image/webp\"\r\n");
      out.write("                     srcset=\"https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/640xauto.webp 640w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/750xauto.webp 750w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/828xauto.webp 828w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/1080xauto.webp 1080w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/1200xauto.webp 1200w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/1920xauto.webp 1920w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/2048xauto.webp 2048w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/3840xauto.webp 3840w\">\r\n");
      out.write("                  <img alt=\"profile\"\r\n");
      out.write("                     srcset=\"https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/640xauto 640w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/750xauto 750w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/828xauto 828w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/1080xauto 1080w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/1200xauto 1200w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/1920xauto 1920w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/2048xauto 2048w,https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/3840xauto 3840w\"\r\n");
      out.write("                     src=\"https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27\"\r\n");
      out.write("                     loading=\"lazy\" class=\"css-1u3hmek\"> </picture>\r\n");
      out.write("                  <span id=\"bottomPointer\"\r\n");
      out.write("                     style=\"position: absolute; left: 92%; top: 13px\"> <svg\r\n");
      out.write("                        xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\"\r\n");
      out.write("                        style=\"padding-left: 16px;\">\r\n");
      out.write("                          <path\r\n");
      out.write("                           d=\"M2.075 8.825 3.49 7.41c.1-.1.255-.1.355 0L12 15.565l8.16-8.16c.1-.1.255-.1.355 0L21.93 8.82c.1.1.1.255 0 .355l-9.75 9.75c-.1.1-.255.1-.355 0L2.075 9.18c-.1-.1-.1-.26 0-.355Z\"\r\n");
      out.write("                           class=\"css-17ivn46\"></path>\r\n");
      out.write("                      </svg>\r\n");
      out.write("                  </span>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"miniBox\">\r\n");
      out.write("               <div id=\"miniBox2\">\r\n");
      out.write("                  <div id=\"miniBox3\">\r\n");
      out.write("                     <div id=\"miniProfile\">\r\n");
      out.write("                        <img\r\n");
      out.write("                           src=\"https://cdn.class101.net/images/cba86b3c-f6a4-42b3-9bbd-bf6c09e49d27/1920xauto.webp\"\r\n");
      out.write("                           alt=\"\">\r\n");
      out.write("                        <div style=\"margin: 10px;\">\r\n");
      out.write("                           <div>닉네임</div>\r\n");
      out.write("                           <div id=\"miniProfileRight\">\r\n");
      out.write("                              <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/schoolMyPage/scDh.jsp\" style=\"color: orange;\">마이페이지 <svg\r\n");
      out.write("                                    xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\"\r\n");
      out.write("                                    class=\"css-jdqsvn\" style=\"width: 10px; height: 10px;\">\r\n");
      out.write("                                          <path\r\n");
      out.write("                                       d=\"M8.825 21.93 7.41 20.515c-.1-.1-.1-.255 0-.355l8.155-8.155-8.16-8.16c-.1-.1-.1-.255 0-.355L8.82 2.075c.1-.1.255-.1.355 0l9.75 9.75c.1.1.1.255 0 .355L9.18 21.93c-.1.1-.26.1-.355 0Z\"\r\n");
      out.write("                                       class=\"css-bchp3n\"></path>\r\n");
      out.write("                                      </svg>\r\n");
      out.write("                              </a>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"css-1g5174\"></div>\r\n");
      out.write("                     <div style=\"text-align: center; cursor: pointer;\" onclick = \"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/main/main.jsp'\">로그아웃</div>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div\r\n");
      out.write("         style=\"margin-left: 23px; font-size: 15px; font-weight: bold; color: rgb(26, 26, 26); line-height: 34px; padding-top: 10px; margin-bottom: 25px\">\r\n");
      out.write("         <h2 style=\"letter-spacing: -2.5px;\">보육원 프로필</h2>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div class=\"sc-e489b3e-3 gEAbaC\"\r\n");
      out.write("         style=\"margin-top: -10px; margin-bottom: -20px;\">\r\n");
      out.write("         <div class=\"sc-e489b3e-7 dkxgGx\"\r\n");
      out.write("            style=\"padding-right: 20px; margin-left: 22px; padding-bottom: 20px;\">\r\n");
      out.write("            <div size=\"28\" class=\"sc-1602cde7-0 bvsxdu\">\r\n");
      out.write("               <img sizes=\" 100vw\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/schoolMyPage/smalluser.png\"\r\n");
      out.write("                  style=\"height: 30px; padding-right: 5px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div md=\"Body2\" class=\"sc-8ee9b8f2-0 gBPcnX sc-e489b3e-8 eaqXQT\"\r\n");
      out.write("               style=\"font-size: 14px; letter-spacing: -1px; padding-right: 394px;\">보육원\r\n");
      out.write("               닉네임</div>\r\n");
      out.write("\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div style=\"padding-left: 21px\">\r\n");
      out.write("         <div>\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/schoolMyPage/123.png\" style=\"height: 315px; width: 605px\">\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div\r\n");
      out.write("         style=\"margin: 20px 20px 0 20px; margin-right: 14px; padding: 16px;\">\r\n");
      out.write("         <div class=\"schoolInfo\" style=\"font-weight: bolder; font-size: 19px;\">강남\r\n");
      out.write("            보육원</div>\r\n");
      out.write("         <div class=\"schoolInfo\">주소 : 서울시 강남구 강남로 100길 10</div>\r\n");
      out.write("         <div class=\"schoolInfo\">전화번호 : 02-1234-1234</div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"sc-e489b3e-9 iLCbOX\"\r\n");
      out.write("         style=\"margin: 15px; margin-right: 14px;\">\r\n");
      out.write("         <div class=\"sc-1f17b81e-1 fGEGPt\">\r\n");
      out.write("            <p class=\"sc-1f17b81e-0 dHJCuF sc-e489b3e-10 iTqZES  \"\r\n");
      out.write("               name=\"content\" autocomplete=\"off\">\r\n");
      out.write("               아이들에게 행복한 추억만 선물하는 강남 보육원입니다.<br>\r\n");
      out.write("\r\n");
      out.write("            </p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <div id=\"withdrawal\">\r\n");
      out.write("      <div id=\"content2\" style=\"margin-top: -20px;\">\r\n");
      out.write("         <div id=\"first\">\r\n");
      out.write("            <button class=\"saveSubmit\" id=\"save\" type=\"submit\" icon-position=\"0\"\r\n");
      out.write("               color=\"default\" fill=\"true\" onclick = \"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/schoolMyPage/scModify.jsp'\">\r\n");
      out.write("               <span>다시 수정하기</span>\r\n");
      out.write("            </button>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <footer class=\"foot\">\r\n");
      out.write("      <div style=\"padding: 24px;\">\r\n");
      out.write("         <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/schoolMyPage/logo.png\">\r\n");
      out.write("         <h5>Milestone 프로젝트는 보육원의 모든 아이들이 사랑받고 아름답게 성장하길 기원합니다.</h5>\r\n");
      out.write("         <p>Milestome Korea</p>\r\n");
      out.write("         <p>Instagram · Youtube · Facebook · Naverpost</p>\r\n");
      out.write("         <p>Naverblog · Playstore · Appstore</p>\r\n");
      out.write("         <p>이용약관 · 개인정보 처리방침 · 이용약관 · 사업자 정보 확인 · 제휴/협력 · 문의 단체/기업 교육 문의</p>\r\n");
      out.write("         <p>동석한 아카데미 Team 4 | 대표 김의엽 | 서울 강남구 테헤란로 146 3층(역삼동) | T4@.inc |\r\n");
      out.write("            전화번호: 1234-1234 |</p>\r\n");
      out.write("      </div>\r\n");
      out.write("   </footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("   src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/MyPage/scmodify2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
