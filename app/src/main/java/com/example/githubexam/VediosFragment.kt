package com.example.githubexam

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.githubexam.databinding.FragmentVediosBinding


class VediosFragment : Fragment() {

    private var _binding: FragmentVediosBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVediosBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btn1.setOnClickListener {
                playVideo("REFazt1lsow")

            }
            btn2.setOnClickListener {
                playVideo("z6usSEptsb0")
            }
            btn3.setOnClickListener {
                playVideo("kdQd3eN3PE")
            }
            btn4.setOnClickListener {
                playVideo("hgk49xTtdDY")
            }
            btn5.setOnClickListener {
                playVideo("9ecBtlfYSpA")
            }
            btn6.setOnClickListener {
                playVideo("4x1qI8jJ8zY")
            }
            btn7.setOnClickListener {
                playVideo("zu7jQ_9NZJY")
            }
            btn8.setOnClickListener {
                playVideo("-aMNMfhJ-wI")
            }


        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("QueryPermissionsNeeded")
    fun playVideo(key: String) {
        var intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$key"))

        if (intent.resolveActivity(activity?.packageManager!!) == null) {
            intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=$key")
            )
        }
        startActivity(intent)
    }
}