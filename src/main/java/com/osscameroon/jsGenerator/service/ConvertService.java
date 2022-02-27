/**
 *
 */
package com.osscameroon.jsGenerator.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

import com.osscameroon.jsGenerator.util.FileUtil;

/**
 * @author osscameroon
 *
 */
public class ConvertService {

	/**
	 * Converts the html string to js string and prints it out.
	 *
	 * @param content the html string
	 */
	public static void convert(String content) {
		Element doc = Jsoup.parse(content, "", Parser.xmlParser());
		System.out.println("generated js: ");
		System.out.println(JsElementService.parseElement(doc));
	}

	/**
	 * Converts the html file to js file
	 *
	 * @param pathToHtml the path to the html file
	 */
	public static void convertFiles(String pathToHtml) {
		String jsFileName = pathToHtml.split(".html")[0] + ".js";

		String htmlContent = FileUtil.readHtmlFile(pathToHtml).toString();
		Element htmlDoc = Jsoup.parse(htmlContent, "", Parser.xmlParser());

		String jsContent = JsElementService.parseElement(htmlDoc);
		FileUtil.writeJsFile(jsContent, jsFileName);

	}

	public static void convertAndPrintBuiltInCodeFromHtmlToJs() {
		// TODO Auto-generated method stub

		System.out.println("\n" + "Converting built-in code from html to js");
		System.out.println("html to convert: " + "\n");

		StringBuilder sampleHtml = new StringBuilder();

		sampleHtml.append("<!-- Button trigger modal -->\n").append(
				"<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n")
				.append("  Launch demo modal\n").append("</button>\n").append("\n").append("<!-- Modal -->\n")
				.append("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n")
				.append("  <div class=\"modal-dialog\" role=\"document\">\n")
				.append("    <div class=\"modal-content\">\n").append("      <div class=\"modal-header\">\n")
				.append("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\n")
				.append("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n")
				.append("          <span aria-hidden=\"true\">&times;</span>\n").append("        </button>\n")
				.append("      </div>\n").append("      <div class=\"modal-body\">\n").append("        ...\n")
				.append("      </div>\n").append("      <div class=\"modal-footer\">\n")
				.append("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n")
				.append("        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n")
				.append("      </div>\n").append("    </div>\n").append("  </div>\n").append("</div>");

		System.out.println(sampleHtml.toString() + "\n");

		convert(sampleHtml.toString());

	}

}