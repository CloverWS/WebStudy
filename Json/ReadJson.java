package de.zpp.desite.exporter;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * ReadJson document
 * @author wz
 *
 */
public class ReadJson {
	private JSONArray resultJson;
	private JSONObject resultJsonObject;

	public JSONArray getResultJson() {
		return resultJson;
	}
	public ReadJson() throws IOException, JSONException {
		this.resultJson = null;
	}

    /**
     * String start with "[]" 
     */
	public JSONArray ReadJsonAsArray(String jsonFilesPath) throws IOException, JSONException {
		// Json Datei handle
		File file = new File(jsonFilesPath);
		String content = FileUtils.readFileToString(file, "UTF-8");
		this.resultJson = new JSONArray(content);
		return resultJson;
	}
	
	/**
	 * String start with "{}" 
	 */
	public JSONObject ReadJsonAsObject(String jsonFilesPath) throws IOException, JSONException {
		// Json Datei handle
		File file = new File(jsonFilesPath);
		String content = FileUtils.readFileToString(file, "UTF-8");
		this.resultJsonObject = new JSONObject(content);
		return resultJsonObject;
	}
	public JSONObject getResultJsonObject() {
		return resultJsonObject;
	}

}
