package co.id.kedai.kedaiapp.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.fragment.app.Fragment
import co.id.kedai.kedaiapp.R
import co.id.kedai.kedaiapp.ui.activity.SteMenuActivity
import co.id.kedai.kedaiapp.databinding.FragmentSteBinding

class SteFragment : Fragment() {
    private var _binding: FragmentSteBinding? = null
    private val binding get() = _binding!!

    private val isOpenRecruitmen  = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgLogoSte17.animation = AnimationUtils.loadAnimation(activity, R.anim.load)
        binding.imgLogoSteCoi.animation = AnimationUtils.loadAnimation(activity, R.anim.load)
        binding.btnDaftar.animation = AnimationUtils.loadAnimation(activity, R.anim.load_button)

        binding.btnDaftar.setOnClickListener {
            if (isOpenRecruitmen) {
                startActivity(Intent(activity, SteMenuActivity::class.java))
            } else {
                Toast.makeText(requireContext(), "Pendaftaran ditutup", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}