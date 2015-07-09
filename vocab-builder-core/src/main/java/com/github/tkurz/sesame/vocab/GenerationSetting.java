package com.github.tkurz.sesame.vocab;

import com.google.common.base.CaseFormat;

public class GenerationSetting {

	private CaseFormat caseFormat;
	private String constantPrefix;
	private String constantSuffix;
	public CaseFormat getCaseFormat() {
		return caseFormat;
	}
	public void setCaseFormat(CaseFormat caseFormat) {
		this.caseFormat = caseFormat;
	}
	public String getConstantPrefix() {
		return constantPrefix;
	}
	public void setConstantPrefix(String constantPrefix) {
		this.constantPrefix = constantPrefix;
	}
	public String getConstantSuffix() {
		return constantSuffix;
	}
	public void setConstantSuffix(String constantSuffix) {
		this.constantSuffix = constantSuffix;
	}
	public static GenerationSetting createDefault(CaseFormat format, String prefix, String suffix) {
		GenerationSetting setting = new GenerationSetting();
		setting.caseFormat = format;
		setting.constantPrefix = prefix;
		setting.constantSuffix = suffix;
		return setting;
		
	}
	public GenerationSetting mergeWith(GenerationSetting other) {
		if ( other == null) {
			other = new GenerationSetting();
		}
		GenerationSetting ov = new GenerationSetting();
		ov.setCaseFormat(other.caseFormat != null ? other.caseFormat : this.caseFormat);
		ov.setConstantPrefix(other.constantPrefix != null ? other.constantPrefix : this.constantPrefix);
		ov.setConstantSuffix(other.constantSuffix != null ? other.constantSuffix : this.constantSuffix);
		return ov;
	}
}
