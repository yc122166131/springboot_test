package com.shmcc.utils;


import com.alibaba.fastjson.JSONObject;

/**
 * 
 */

public class JSONResult {
    private boolean success = false;
    private String message = "";
    private JSONObject result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    private JSONResult() {
        try {
            this.result = new JSONObject();
        } catch (Exception e) {

        }
    }

    public static JSONResult getJsonResult() {
        JSONResult jsonResult = new JSONResult();
        return jsonResult;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void put(Object object) {
        try {
            result.put("result", object);
        } catch (Exception e) {
        }

    }

    public String toJsonObject() {
        try {
            JSONObject object = new JSONObject();
            object.put("success", success);
            object.put("message", message);
            object.put("result", result);
            return object.toString();
        } catch (Exception e) {
            return null;
        }
    }

}
