package com.deveficiente.heuristicas.valueobjects.cpf.v2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CPFFormatter {

	private final Pattern formatted = Pattern.compile("(\\d{3})[.](\\d{3})[.](\\d{3})-(\\d{2})");
	private final String literalFormatted = "$1.$2.$3-$4";
	private final Pattern unformatted = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
	private final String literalUnformatted = "$1$2$3$4";


	public String format(String value) {

		Matcher matcher = unformatted.matcher(value);
        return matcher.replaceAll(literalFormatted);
    }

	public String unformat(String value) {

		Matcher matcher = formatted.matcher(value);
		return matcher.replaceAll(literalUnformatted);
    }

	public boolean isFormatted(String value) {
		return formatted.matcher(value).matches();
	}
}