package teste;

import java.io.IOException;
import java.lang.System.Logger.Level;
import java.net.MalformedURLException;
import java.util.logging.Logger;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class main {

	public static void main(String[] args) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
	
		// Obtém a página de login.
		// Simulando um navegador Chrome.
		WebClient client = new WebClient(BrowserVersion.CHROME);

		client.getOptions().setThrowExceptionOnScriptError(false);

		// Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF);
		
		// Obtém a página.
		HtmlPage paginaDeLogin = client.getPage("http://anderson85.net");
		
		// Mostra o código html da página
		System.out.println(paginaDeLogin.getWebResponse().getContentAsString());
	}

}
