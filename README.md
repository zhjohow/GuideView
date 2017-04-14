# GuideView
hello world 

一个用于 app 新功能高亮引导的库,支持圆形、椭圆形、矩形高亮形状)


支持配置属性： （1）外部点击是否关闭setTouchOutsideDismiss （2）控件高亮形状类型，有圆形、椭圆形、矩形setHighLightStyle （3）高亮画笔类型，有平滑和一般，默认平滑setMaskblurstyle （4）蒙层颜色setMaskColor （5）高亮控件padding,setHighLisghtPadding


1. 全屏提示，没高亮控件情况引导

GuideView.builder(this) .addNoHighLightGuidView(R.drawable.listlead) 
.setMaskColor(getResources().getColor(R.color.mask_color)) .show();

2. 有高亮控件情况引导（单个高亮控件）

GuideView.builder(this) .addHighLightGuidView(view, R.drawable.dmtext)
.setHighLightStyle(HighLightGuideView.VIEWSTYLE_OVAL) .show();

3. 有高亮控件情况引导（多个高亮控件）

GuideView.builder(this) .addHighLightGuidView(view1, R.drawable.dstext) 
.addHighLightGuidView(view2, R.drawable.dmtext) .setHighLightStyle(HighLightGuideView.VIEWSTYLE_OVAL) .show();
