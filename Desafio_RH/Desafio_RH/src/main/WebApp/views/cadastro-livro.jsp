<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" version="2.0">
    <jsp:directive.page language="java"
        contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
    <jsp:text>
        <![CDATA[ <?xml version="1.0" encoding="UTF-8" ?> ]]>
    </jsp:text>
    <jsp:text>
        <![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
    </jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert Cadastro de Livros</title>
</head>
<body>
<f:view>
<html>
<nav class="navbar bg-light navbar-light"></nav>

	<form:form class="form-horizontal" method="post"
		action="/livro/salvar" modelAttribute="livro">

		<c:if test="${!empty mensagem}">
			<div class="alert alert-success">
				<span>${mensagem}</span>
			</div>
		</c:if>

		<div class="card">
			<div class="card-header">
				<div class="clearfix">
					
					<h4 class="card-title impacta-titulo-panel">
						Nova Livro 
							<a class="btn btn-link float-right" href="/logout">Logout</a>
							<a
							class="btn btn-link float-right impacta-link-panel"
							href="/despesa">Listagem de Livros</a>
					</h4>
				</div>
			</div>
			<div class="card-body">

				<form:hidden path="isbn"/>

				<div class="form-group">
					<label for="descricao" class="col-sm-2 control-label">Titulo</label>
					<div class="col-sm-4">
						<form:input class="form-control" path="titulo" />
						<form:errors path="descricao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label for="categoria" class="col-sm-2 control-label">Autores</label>
					<div class="col-sm-2">
						<form:select class="form-control" path="autores">
							<form:options />
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<label for="data" class="col-sm-2 control-label">Data Publicação</label>
					<div class="col-sm-2">
						<form:input class="form-control" path="data" autocomplete="off"
							data-provide="datepicker" data-date-format="dd/mm/yyyy"
							data-date-language="pt-BR" data-date-autoclose="true"
							data-date-todayHighlight="true" data-date-orientation="bottom" />
						<form:errors path="data" cssClass="error" />
					</div>
				</div>

				<div class="form-group">
					<label for="valor" class="col-sm-2 control-label">Preço</label>
					<div class="col-sm-2">
						<form:input class="form-control javascript-moeda" path="preço" />
						<form:errors path="valor" cssClass="error" />						
					</div>
				</div>

				<div class="form-group">
					<label for="observacoes" class="col-sm-2 control-label">Criticas</label>
					<div class="col-sm-6">
						<form:input class="form-control" path="criticas" />
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
</html>
</f:view>
</body>
</html>
</jsp:root>