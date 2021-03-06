package com.example.android.my_guess_it

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.my_guess_it.databinding.TitleFragmentBinding

class TitleFragment : Fragment() {

    private lateinit var binding: TitleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.title_fragment, container, false)

        binding.playButton.setOnClickListener {
            it.findNavController()
                .navigate(TitleFragmentDirections.actionTitleFragment2ToGameFragment2())
        }
        return binding.root
    }
}
