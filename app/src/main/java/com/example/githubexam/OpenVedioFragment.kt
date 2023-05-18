package com.example.githubexam

import android.R
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.githubexam.databinding.FragmentOpenVedioBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "key"
private const val ARG_PARAM2 = "param2"


class OpenVedioFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: Int? = null

    private var _binding: FragmentOpenVedioBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOpenVedioBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
        }


    }

    companion object {

        @JvmStatic
        fun newInstance(param1: Int) =
            OpenVedioFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, param1)
                }
            }
    }
}