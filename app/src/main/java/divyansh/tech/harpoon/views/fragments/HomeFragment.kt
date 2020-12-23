package divyansh.tech.harpoon.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import divyansh.tech.harpoon.R
import divyansh.tech.harpoon.views.BaseFragment

class HomeFragment: BaseFragment() {
    override fun provideView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}