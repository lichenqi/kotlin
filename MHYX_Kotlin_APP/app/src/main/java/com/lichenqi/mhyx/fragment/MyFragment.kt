package com.lichenqi.mhyx.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lichenqi.mhyx.R

class MyFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.my_fragment, container, false)
        return view
    }

}