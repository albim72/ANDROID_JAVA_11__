<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="KALKULATOR ODLEGŁOŚCI"
            android:textSize="20sp" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <TextView
                android:id="@+id/textView2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="podaj odległość [m]" />

            <EditText
                android:id="@+id/etMetry"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:ems="10"
                android:inputType="text"
                tools:ignore="TouchTargetSizeCheck,SpeakableTextPresentCheck" />
        </LinearLayout>

        <TextView
            android:id="@+id/textView3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="TextView" />

        <RadioGroup
            android:id="@+id/rgroup"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <RadioButton
                android:id="@+id/rbmilaM"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="mila morska" />

            <RadioButton
                android:id="@+id/rbmilaL"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="mila lądowa" />

            <RadioButton
                android:id="@+id/rbjard"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="jard" />

            <RadioButton
                android:id="@+id/rbstopa"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="stopa" />

            <RadioButton
                android:id="@+id/rbcal"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="cal" />

        </RadioGroup>

        <Button
            android:id="@+id/button"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Button" />

        <TextView
            android:id="@+id/wynik"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
