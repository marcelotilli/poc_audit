<%@ page import="projecttracker.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'userName', 'error')} ">
	<label for="userName">
		<g:message code="user.userName.label" default="User Name" />
		
	</label>
	<g:textField name="userName" value="${userInstance?.userName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} ">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		
	</label>
	<g:field type="password" name="password" value="${userInstance?.password}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'pessoaFisica', 'error')} required">
	<label for="pessoaFisica">
		<g:message code="user.pessoaFisica.label" default="Pessoa Fisica" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="pessoaFisica" name="pessoaFisica.id" from="${projecttracker.PessoaFisica.list()}" optionKey="id" required="" value="${userInstance?.pessoaFisica?.id}" class="many-to-one"/>
</div>

