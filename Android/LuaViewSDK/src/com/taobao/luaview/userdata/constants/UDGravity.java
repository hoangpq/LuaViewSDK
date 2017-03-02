package com.taobao.luaview.userdata.constants;

import android.view.Gravity;

import com.taobao.luaview.userdata.base.BaseLuaTable;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/**
 * Gravity 文本布局
 *
 * @author song
 * @date 15/9/6
 */
public class UDGravity extends BaseLuaTable {

    public UDGravity(Globals globals, LuaValue metatable) {
        super(globals, metatable);
        init();
    }

    private void init() {
        initGravity();
    }

    /**
     * 设置gravity
     */
    private void initGravity() {
        set("LEFT", Gravity.LEFT);
        set("TOP", Gravity.TOP);
        set("RIGHT", Gravity.RIGHT);
        set("BOTTOM", Gravity.BOTTOM);
        set("H_CENTER", Gravity.CENTER_HORIZONTAL);
        set("V_CENTER", Gravity.CENTER_VERTICAL);

        set("CENTER", Gravity.CENTER);//TODO IOS无
        set("START", Gravity.START);//TODO IOS无
        set("END", Gravity.END);//TODO IOS无
        set("FILL", Gravity.FILL);//TODO IOS无
        set("H_FILL", Gravity.FILL_HORIZONTAL);//TODO IOS无
        set("V_FILL", Gravity.FILL_VERTICAL);//TODO IOS无
    }

}
