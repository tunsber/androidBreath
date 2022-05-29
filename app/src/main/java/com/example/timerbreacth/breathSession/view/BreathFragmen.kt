package com.example.timerbreacth.breathSession.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.timerbreacth.R
import com.example.timerbreacth.breathSession.SessionParametr
import com.example.timerbreacth.breathSession.viewModel.BreathViewModel

class BreathFragmen: Fragment() {
    private val viewModel: BreathViewModel = BreathViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_breath_session,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.listener = this

        val inhaleValue = view.findViewById<TextView>(R.id.VdoxKrug)
        val exhaleValue = view.findViewById<TextView>(R.id.VedoxKrug)
        val pauseValue = view.findViewById<TextView>(R.id.VdoxKrug2)
        val haleValue = view.findViewById<TextView>(R.id.VedoxKrug2)

        inhaleValue.text = viewModel.parameters.inhale.toString()
        exhaleValue.text = viewModel.parameters.sessionDelay1.toString()
        pauseValue.text = viewModel.parameters.exhale.toString()
        haleValue.text = viewModel.parameters.sessionDelay2.toString()
    }

    fun onChange(newValue: SessionParametr) {
        val inhaleValue = view?.findViewById<TextView>(R.id.VdoxKrug)
        val exhaleValue = view?.findViewById<TextView>(R.id.VedoxKrug)
        val pauseValue = view?.findViewById<TextView>(R.id.VdoxKrug2)
        val haleValue = view?.findViewById<TextView>(R.id.VedoxKrug2)

        inhaleValue?.text = newValue.inhale.toString()
        exhaleValue?.text = newValue.sessionDelay1.toString()
        pauseValue?.text = newValue.exhale.toString()
        haleValue?.text = newValue.sessionDelay2.toString()
    }
}