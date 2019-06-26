package com.optisoft.otpview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import org.w3c.dom.Text;

import androidx.annotation.Dimension;
import androidx.annotation.Nullable;

public class OTPVIEW extends LinearLayout implements TextWatcher {

    private EditText ed1, ed2, ed3, ed4, ed5, ed6;
    private int maxLengthofEditText = 1;
    private String size;
    private Float dimension;
    private LinearLayout.LayoutParams param;

    public OTPVIEW(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.OTPVIEW, 0, 0);
        size = a.getString(R.styleable.OTPVIEW_otpViesSize);
        dimension = a.getDimension(R.styleable.OTPVIEW_txtSize, 0f);

        a.recycle();


        if (TextUtils.isEmpty(size) || Integer.parseInt(size) < 3 || Integer.parseInt(size) > 6) {
            size = "3";
        }


        param = new LinearLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,
                1.0f
        );

        if (size.equalsIgnoreCase("4")) {

            ed1 = new EditText(context);
            ed1.setLayoutParams(param);
            ed1.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed1.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed1.setGravity(Gravity.CENTER);
            ed1.setSingleLine(true);
            addView(ed1);

            ed2 = new EditText(context);
            ed2.setLayoutParams(param);
            ed2.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed2.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed2.setGravity(Gravity.CENTER);
            ed2.setSingleLine(true);
            addView(ed2);

            ed3 = new EditText(context);
            ed3.setLayoutParams(param);
            ed3.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed3.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed3.setGravity(Gravity.CENTER);
            ed3.setSingleLine(true);
            addView(ed3);

            ed4 = new EditText(context);

            ed4.setLayoutParams(param);
            ed4.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed4.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed4.setGravity(Gravity.CENTER);
            ed4.setSingleLine(true);
            addView(ed4);
        } else if (size.equalsIgnoreCase("3")) {

            ed1 = new EditText(context);
            ed1.setLayoutParams(param);
            ed1.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed1.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed1.setGravity(Gravity.CENTER);
            ed1.setSingleLine(true);
            addView(ed1);

            ed2 = new EditText(context);
            ed2.setLayoutParams(param);
            ed2.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed2.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed2.setGravity(Gravity.CENTER);
            ed2.setSingleLine(true);
            addView(ed2);

            ed3 = new EditText(context);
            ed3.setLayoutParams(param);
            ed3.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed3.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed3.setGravity(Gravity.CENTER);
            ed3.setSingleLine(true);
            addView(ed3);

        } else if (size.equalsIgnoreCase("6")) {

            ed1 = new EditText(context);
            ed1.setLayoutParams(param);
            ed1.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed1.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed1.setGravity(Gravity.CENTER);
            ed1.setSingleLine(true);
            addView(ed1);

            ed2 = new EditText(context);
            ed2.setLayoutParams(param);
            ed2.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed2.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed2.setGravity(Gravity.CENTER);
            ed2.setSingleLine(true);
            addView(ed2);

            ed3 = new EditText(context);
            ed3.setLayoutParams(param);
            ed3.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed3.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed3.setGravity(Gravity.CENTER);
            ed3.setSingleLine(true);
            addView(ed3);

            ed4 = new EditText(context);

            ed4.setLayoutParams(param);
            ed4.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed4.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed4.setGravity(Gravity.CENTER);
            ed4.setSingleLine(true);
            addView(ed4);

            ed5 = new EditText(context);
            ed5.setLayoutParams(param);
            ed5.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed5.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed5.setGravity(Gravity.CENTER);
            ed5.setSingleLine(true);
            addView(ed5);

            ed6 = new EditText(context);
            ed6.setLayoutParams(param);
            ed6.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
            ed6.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed6.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLengthofEditText)});
            ed6.setGravity(Gravity.CENTER);
            ed6.setSingleLine(true);
            addView(ed6);

        }


        if (dimension != 0) {
            if (size.equalsIgnoreCase("3")) {
                ed1.setTextSize(dimension);
                ed2.setTextSize(dimension);
                ed3.setTextSize(dimension);
            } else if (size.equalsIgnoreCase("4")) {
                ed1.setTextSize(dimension);
                ed2.setTextSize(dimension);
                ed3.setTextSize(dimension);
                ed4.setTextSize(dimension);

            } else if (size.equalsIgnoreCase("6")) {
                ed1.setTextSize(dimension);
                ed2.setTextSize(dimension);
                ed3.setTextSize(dimension);
                ed4.setTextSize(dimension);
                ed5.setTextSize(dimension);
                ed6.setTextSize(dimension);
            }
        }


        ed1.addTextChangedListener(this);
        ed2.addTextChangedListener(this);
        ed3.addTextChangedListener(this);
        if (size.equalsIgnoreCase("6")) {
            ed4.addTextChangedListener(this);
            ed5.addTextChangedListener(this);
            ed6.addTextChangedListener(this);
        } else if (size.equalsIgnoreCase("4")) {
            ed4.addTextChangedListener(this);
        }

      /*  ed1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (ed1.length() == 1) {
                    if (ed2.length() == 1) {
                        if(ed3.length() == 1)
                        {
                            if(ed4.length() == 1)
                            {
                                if(ed5.length() == 1)
                                {
                                    ed6.requestFocus();

                                }else {
                                    ed5.requestFocus();
                                }

                            }else {
                                ed4.requestFocus();
                            }

                        }else {
                            ed3.requestFocus();
                        }

                    }else {
                        ed2.requestFocus();
                    }

                }

            }
        });


        ed2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (ed2.length() == 1) {
                    if(ed3.length() == 1)
                    {
                        if(ed4.length() == 1)
                        {
                            if(ed5.length() == 1)
                            {
                                ed6.requestFocus();

                            }else {
                                ed5.requestFocus();
                            }

                        }else {
                            ed4.requestFocus();
                        }

                    }else {
                        ed3.requestFocus();
                    }

                }
            }
        });


        ed3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (ed3.length() == 1) {
                    if(ed4.length() == 1)
                    {
                        if(ed5.length() == 1)
                        {
                            ed6.requestFocus();

                        }else {
                            ed5.requestFocus();
                        }

                    }else {
                        ed4.requestFocus();
                    }

                }
            }
        });


        ed4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (ed4.length() == 1) {
                    if(ed5.length() == 1)
                    {
                        ed6.requestFocus();

                    }else {
                        ed5.requestFocus();
                    }
                }
            }
        });


        ed5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (ed5.length() == 1) {
                    ed6.requestFocus();
                }


            }
        });*/


    }

    public boolean isValidOtp() {
        if (size.equalsIgnoreCase("6")) {
            if (!TextUtils.isEmpty(ed1.getText().toString()) && !TextUtils.isEmpty(ed2.getText().toString())
                    && !TextUtils.isEmpty(ed3.getText().toString()) && !TextUtils.isEmpty(ed4.getText().toString())
                    && !TextUtils.isEmpty(ed5.getText().toString()) && !TextUtils.isEmpty(ed6.getText().toString())) {
                return true;
            } else {
                return false;
            }
        } else if (size.equalsIgnoreCase("4")) {
            if (!TextUtils.isEmpty(ed1.getText().toString()) && !TextUtils.isEmpty(ed2.getText().toString())
                    && !TextUtils.isEmpty(ed3.getText().toString()) && !TextUtils.isEmpty(ed4.getText().toString())) {
                return true;
            } else {
                return false;
            }
        } else {
            if (!TextUtils.isEmpty(ed1.getText().toString()) && !TextUtils.isEmpty(ed2.getText().toString())
                    && !TextUtils.isEmpty(ed3.getText().toString())) {
                return true;
            } else {
                return false;
            }
        }

    }


    public String getOtpVal() {
        String str = "";
        if (size.equalsIgnoreCase("6")) {
            str = ed1.getText().toString().trim() + ed2.getText().toString() + ed3.getText().toString() + ed4.getText().toString() + ed5.getText().toString() + ed6.getText().toString();

        } else if (size.equalsIgnoreCase("4")) {
            str = ed1.getText().toString().trim() + ed2.getText().toString() + ed3.getText().toString() + ed4.getText().toString();

        } else {
            str = ed1.getText().toString().trim() + ed2.getText().toString() + ed3.getText().toString();
        }

        return str;
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {


        if (!TextUtils.isEmpty(s)) {

            if (size.equalsIgnoreCase("6")) {
                if (ed1.length() == 1) {
                    if (ed2.length() == 1) {
                        if (ed3.length() == 1) {
                            if (ed4.length() == 1) {
                                if (ed5.length() == 1) {
                                    ed6.requestFocus();

                                } else {
                                    ed5.requestFocus();
                                }

                            } else {
                                ed4.requestFocus();
                            }

                        } else {
                            ed3.requestFocus();
                        }

                    } else {
                        ed2.requestFocus();
                    }

                }
            } else if (size.equalsIgnoreCase("4")) {
                if (ed1.length() == 1) {
                    if (ed2.length() == 1) {
                        if (ed3.length() == 1) {
                            ed4.requestFocus();

                        } else {
                            ed3.requestFocus();
                        }

                    } else {
                        ed2.requestFocus();
                    }

                }
            } else if (size.equalsIgnoreCase("3")) {
                if (ed1.length() == 1) {
                    if (ed2.length() == 1) {
                        ed3.requestFocus();

                    } else {
                        ed2.requestFocus();
                    }

                }
            }





          /*  if (ed1.length() == 1) {
                ed2.requestFocus();
            }  if (ed2.length() == 1) {
                ed3.requestFocus();
            }  if (ed3.length() == 1) {
                ed4.requestFocus();
            }  if (ed4.length() == 1) {
                ed5.requestFocus();
            }  if (ed5.length() == 1) {
                ed6.requestFocus();
            }*/

           /* if (size.equalsIgnoreCase("4")) {
                if (ed3.length() == 1) {
                    ed4.requestFocus();
                }
            } else if (size.equalsIgnoreCase("6")) {
                if (ed3.length() == 1) {
                    ed4.requestFocus();
                }
                if (ed4.length() == 1) {
                    ed5.requestFocus();
                }

                if (ed5.length() == 1) {
                    ed6.requestFocus();
                }
            }*/

        }


    }
}
