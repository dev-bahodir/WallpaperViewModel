package com.example.walpppaperappkotlin.ui.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.walpppaperappkotlin.R
import com.example.walpppaperappkotlin.databinding.FragmentPhotoEditorBinding
import com.squareup.picasso.Picasso
import java.io.File

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "url"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PhotoEditorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PhotoEditorFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var url: String? = null
   // private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            url = it.getString(ARG_PARAM1)
            //param2 = it.getString(ARG_PARAM2)
        }
    }
    private var _binding: FragmentPhotoEditorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPhotoEditorBinding.inflate(inflater, container, false)

        /*Glide.with(requireContext()).load(url).into(binding.photoEditorView)

        Picasso.get().load(url).into(binding.photoEditorView)*/

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param url Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PhotoEditorFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(url: String) =
            PhotoEditorFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, url)
                   // putString(ARG_PARAM2, param2)
                }
            }
    }
}