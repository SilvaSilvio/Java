package control;



import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Util {
	public static void adicionarMensagem(String mensagem) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = new FacesMessage();
		facesMessage.setSummary(mensagem);
		context.addMessage(null, facesMessage);
	}

	public static Object getObjetoManagedBean(String el) {
		FacesContext context = FacesContext.getCurrentInstance();
		Application app = context.getApplication();
		ExpressionFactory expressionFactory = app.getExpressionFactory();
		ValueExpression ve = expressionFactory.createValueExpression(context.getELContext(), el, Object.class);
		return ve.getValue(context.getELContext());
	}

	public static void removerSessao(String managedBean) {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute(managedBean);
	}
}
