<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" version="2.0">
    <jsp:directive.page language="java"
        contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" />
    <jsp:text>
        <![CDATA[ <?xml version="1.0" encoding="UTF-8" ?> ]]>
    </jsp:text>
    <jsp:text>
        <![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
    </jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Cadastro de Autores</title>
</head>
<body>
<f:view>
<nav class="navbar bg-light navbar-light"></nav>

	<form:form class="form-horizontal" method="post"
		action="/autores/salvar" modelAttribute="autores">

		<c:if test="${!empty mensagem}">
			<div class="alert alert-success">
				<span>${mensagem}</span>
			</div>
		</c:if>

		<div class="card">
			<div class="card-header">
				<div class="clearfix">
					
					<h4 class="card-title impacta-titulo-panel">
						Nova Autor 
							<a class="btn btn-link float-right" href="/logout">Logout</a>
							<a
							class="btn btn-link float-right impacta-link-panel"
							href="/despesa">Listagem de Autores</a>
					</h4>
				</div>
			</div>
			<div class="card-body">

				<form:hidden path="id"/>

				<div class="form-group">
					<label for="categoria" class="col-sm-2 control-label">Autores</label>
					<div class="col-sm-2">
						<form:select class="form-control" path="autores">
							<form:options />
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary">Salvar</button>
					</div>
				</div>
			</div>
		</div>
	</form:form>

	<script src="/js/jquery-3.1.1.min.js"></script>
	<script src="/js/bootstrap-min.js"></script>
	<script src="/js/bootstrap-datepicker.min.js"></script>
	<script src="/js/bootstrap-datepicker.pt-BR.min.js"></script>
	<script src="/js/jquery.maskMoney.min.js"></script>
	
	

</f:view>
</body>
</html>
</jsp:root>