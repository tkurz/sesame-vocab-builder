package com.github.tkurz.sesame.vocab;

import com.google.common.base.CaseFormat;
/**
 * Simple configuration structure for 
 * <ul>
 * <li>caseFormat
 * <li>constantPrefix
 * <li>constantSuffix
 * </ul>
 * This structure may be used in the <code>pom.xml</code> under
 * the configuration setting and also with the vocabularies. 
 * @author dglachs
 *
 */
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
	/**
	 * Helper method for providing a pre-filled setting
	 * @param format
	 * @param prefix
	 * @param suffix
	 * @return
	 */
	public static GenerationSetting createDefault(CaseFormat format, String prefix, String suffix) {
		GenerationSetting setting = new GenerationSetting();
		setting.caseFormat = format;
		setting.constantPrefix = prefix;
		setting.constantSuffix = suffix;
		return setting;
		
	}
	/**
	 * Merge another {@link GenerationSetting} with the current one
	 * if any of the other values is not <code>null</code>, it overrides the actual
	 * setting. A new instance of {@link GenerationSetting} is created. 
	 * @param other The other {@link GenerationSetting} object
	 * @return a new merged {@link GenerationSetting}
	 */
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
