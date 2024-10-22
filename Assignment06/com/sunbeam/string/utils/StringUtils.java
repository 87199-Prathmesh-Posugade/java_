package com.sunbeam.string.utils;

public class StringUtils {
	private StringBuffer str;

	public StringBuffer setGetStr(StringBuffer str) {
		this.str = str;
		return str;
	}

	@Override
	public boolean equals(Object o) {
		StringBuffer s = (StringBuffer) o;
		if (this.str.length() != s.length()) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (this.str.charAt(i) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public StringBuffer reversedString(StringBuffer s) {
		StringBuffer rev = new StringBuffer("");
		for (int i = s.length() - 1; i > -1; i--) {
			rev.append(s.charAt(i));
		}
		return rev;
	}

	public boolean checkPallindrome(StringBuffer s) {
		if (s.length() < 2) {
			return true;
		}
		int low = 0;
		int high = (s.length() - 1);
		int mid = high / 2;
		while (low <= mid) {
			if (s.charAt(low) == s.charAt(high)) {
				low++;
				high--;
			} else {
				return false;
			}
		}
		return true;
	}
}
