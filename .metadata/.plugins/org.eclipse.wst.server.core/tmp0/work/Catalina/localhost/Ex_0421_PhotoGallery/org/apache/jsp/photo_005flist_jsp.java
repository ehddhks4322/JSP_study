/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-04-26 12:51:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class photo_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/D:/java_study/JSP/util/apache-tomcat-8.5.87/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1677493954000L));
    _jspx_dependants.put("jar:file:/D:/java_study/JSP/util/apache-tomcat-8.5.87/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>Insert title here</title>\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"css/photo.css\">\r\n");
      out.write("		<script src=\"js/httpRequest.js\"></script>\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("			function del(f){\r\n");
      out.write("				var idx = f.idx.value;\r\n");
      out.write("				var pwd = f.pwd.value;\r\n");
      out.write("				var pwd2 = f.pwd2.value;\r\n");
      out.write("				\r\n");
      out.write("				if(pwd != pwd2){\r\n");
      out.write("					alert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				//alert(idx);\r\n");
      out.write("				\r\n");
      out.write("				if(!confirm(\"삭제하시겠습니까?\")){\r\n");
      out.write("					return;\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				//삭제를 원하는 idx를 서버로 전송\r\n");
      out.write("				var url = \"photo_del.do\";\r\n");
      out.write("				var param = \"idx=\"+idx+\"&filename=\"+f.filename.value;\r\n");
      out.write("				\r\n");
      out.write("				sendRequest(url,param,finRes,\"POST\");\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			function finRes(){\r\n");
      out.write("				if(xhr.readyState == 4 && xhr.status == 200){\r\n");
      out.write("					\r\n");
      out.write("					//서블릿으로부터 도착한 데이터 읽어오기\r\n");
      out.write("					var data = xhr.responseText;\r\n");
      out.write("					\r\n");
      out.write("					//넘겨받은 데이터는 \"\"로 묶여진 문자열 구조로 인식하기 때문에\r\n");
      out.write("					//JSON형식으로 변경해줘야한다.\r\n");
      out.write("					var json = eval(data);\r\n");
      out.write("					\r\n");
      out.write("					if(json[0].param == 'yes'){\r\n");
      out.write("						alert(\"삭제성공\");\r\n");
      out.write("					}else{\r\n");
      out.write("						alert(\"삭제실패\");\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("					location.href=\"list.do\";\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			function download(fn){\r\n");
      out.write("				\r\n");
      out.write("				location.href=\"download.do?dir=/upload/&filename=\"+fn;\r\n");
      out.write("			}\r\n");
      out.write("		</script>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("		<div id=\"main_box\">\r\n");
      out.write("			<h1>:::Photo Gallery:::</h1>\r\n");
      out.write("			\r\n");
      out.write("			<div align=\"center\">\r\n");
      out.write("				<input type=\"button\" value=\"사진등록\" onclick=\"location.href='insert_form.jsp'\">\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		<!-- for(PhotoVO vo : list){\r\n");
      out.write("			System.out.println(vo.getTitle());\r\n");
      out.write("			System.out.println(vo.getFilename());\r\n");
      out.write("			}\r\n");
      out.write("		} -->\r\n");
      out.write("			<div id=\"photo_box\">\r\n");
      out.write("			<!-- for(PhotoVO vo : list){\r\n");
      out.write("						\r\n");
      out.write("				}\r\n");
      out.write("			 -->\r\n");
      out.write("				");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /photo_list.jsp(80,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("vo");
      // /photo_list.jsp(80,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/photo_list.jsp(80,4) '${list}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("					\r\n");
            out.write("					<div class=\"photo_type\">\r\n");
            out.write("						<img src=\"upload/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.filename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("						<div class=\"title\"> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(" </div>\r\n");
            out.write("						\r\n");
            out.write("						<form>\r\n");
            out.write("						<input type=\"hidden\" name=\"idx\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("						<input type=\"hidden\" name=\"pwd\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.pwd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("						<input type=\"hidden\" name=\"filename\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.filename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">\r\n");
            out.write("						<div align=\"center\">\r\n");
            out.write("							<input type=\"password\" name=\"pwd2\" size=\"5\">\r\n");
            out.write("							<input type=\"button\" value=\"down\" onclick=\"download('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.filename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("')\">\r\n");
            out.write("							<input type=\"button\" value=\"삭제\" onclick=\"del(this.form)\">\r\n");
            out.write("						</div>\r\n");
            out.write("						</form>\r\n");
            out.write("					</div>\r\n");
            out.write("				\r\n");
            out.write("				\r\n");
            out.write("				");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
