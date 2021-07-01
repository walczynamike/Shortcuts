package com.zornerv.shortcuts

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.zornerv.shortcuts.databinding.FragmentABinding
import com.zornerv.shortcuts.util.viewBinding

class FragmentB : Fragment(R.layout.fragment_a) {

    private val binding by viewBinding(FragmentABinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: ")

        binding.title.text = "Fragment B - Vaccine"

        with(binding.button) {
            text = "Navigate to C"
            setOnClickListener {
                findNavController().navigate(FragmentBDirections.goToC())
            }
        }
    }

    companion object{
        private const val TAG = "FragmentB"
    }

}