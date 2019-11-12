package com.hypergraph.autofence.ui.dashboard


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.hypergraph.autofence.R
import kotlinx.android.synthetic.main.fragment_dashboard.*

/**
 * A simple [Fragment] subclass.
 */
class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Retrieve the NavController from any Fragment created by a NavHostFragment by passing in
        // this
        val navController: NavController = NavHostFragment.findNavController(this)

        // Use action ID to navigate with animation defined in nav graph
        my_btn.setOnClickListener {
            navController.navigate(R.id.action_navigation_dashboard_to_childFragment)
        }

    }
}
