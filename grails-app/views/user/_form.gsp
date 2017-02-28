<%@ page import="com.es.integration.demo.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'emailId', 'error')} required">
	<label for="emailId">
		<g:message code="user.emailId.label" default="Email Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="emailId" required="" value="${userInstance?.emailId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="user.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${userInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="user.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${userInstance?.lastName}"/>

</div>

