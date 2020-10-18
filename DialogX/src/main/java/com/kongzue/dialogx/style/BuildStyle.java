package com.kongzue.dialogx.style;

import com.kongzue.dialogx.R;
import com.kongzue.dialogx.interfaces.DialogXStyle;

/**
 * @author: Kongzue
 * @github: https://github.com/kongzue/
 * @homepage: http://kongzue.com/
 * @mail: myzcxhh@live.cn
 * @createTime: 2020/10/11 12:26
 */
public class BuildStyle implements DialogXStyle {
    public static BuildStyle style() {
        return new BuildStyle();
    }
    
    @Override
    public int layout(boolean light) {
        return light ? R.layout.layout_dialogx_material : R.layout.layout_dialogx_material_dark;
    }
    
    @Override
    public int enterAnimResId() {
        return R.anim.anim_dialogx_default_enter;
    }
    
    @Override
    public int exitAnimResId() {
        return R.anim.anim_dialogx_default_exit;
    }
    
    @Override
    public int[] verticalButtonOrder() {
        return new int[]{BUTTON_OK, BUTTON_OTHER, BUTTON_CANCEL};
    }
    
    @Override
    public int[] horizontalButtonOrder() {
        return new int[]{BUTTON_OTHER, SPACE, BUTTON_CANCEL, BUTTON_OK};
    }
    
    @Override
    public int splitWidthPx() {
        return 1;
    }
    
    @Override
    public int splitColorRes(boolean light) {
        return 0;
    }
    
    @Override
    public BlurBackgroundSetting messageDialogBlurSettings() {
        return null;
    }
    
    @Override
    public HorizontalButtonRes overrideHorizontalButtonRes() {
        return new HorizontalButtonRes() {
            @Override
            public int overrideHorizontalOkButtonBackgroundRes(int visibleButtonCount, boolean light) {
                return light ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night;
            }
            
            @Override
            public int overrideHorizontalCancelButtonBackgroundRes(int visibleButtonCount, boolean light) {
                return light ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night;
            }
            
            @Override
            public int overrideHorizontalOtherButtonBackgroundRes(int visibleButtonCount, boolean light) {
                return light ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night;
            }
        };
    }
    
    @Override
    public VerticalButtonRes overrideVerticalButtonRes() {
        return new VerticalButtonRes() {
            @Override
            public int overrideVerticalOkButtonBackgroundRes(int visibleButtonCount, boolean light) {
                return light ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night;
            }
            
            @Override
            public int overrideVerticalCancelButtonBackgroundRes(int visibleButtonCount, boolean light) {
                return light ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night;
            }
            
            @Override
            public int overrideVerticalOtherButtonBackgroundRes(int visibleButtonCount, boolean light) {
                return light ? R.drawable.button_dialogx_material_light : R.drawable.button_dialogx_material_night;
            }
        };
    }
    
    @Override
    public WaitTipRes overrideWaitTipRes() {
        return new WaitTipRes() {
            @Override
            public boolean blurBackground() {
                return false;
            }
            
            @Override
            public int overrideBackgroundColorRes(boolean light) {
                return 0;
            }
            
            @Override
            public int overrideTextColorRes(boolean light) {
                return light ? R.color.white : R.color.black;
            }
        };
    }
    
    @Override
    public BottomDialogRes overrideBottomDialogRes() {
        return null;
    }
    
}