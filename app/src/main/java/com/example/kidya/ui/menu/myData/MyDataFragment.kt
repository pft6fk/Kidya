package com.example.kidya.ui.menu.myData

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.FragmentMyDataBinding
//import com.google.android.libraries.maps.GoogleMap
//import com.google.android.libraries.maps.MapView
//import com.google.android.libraries.maps.OnMapReadyCallback


class MyDataFragment : Fragment() { //, OnMapReadyCallback
//    private val MAPVIEW_BUNDLE_KEY: String = "MapViewBundleKey"
//    private lateinit var mMapView: MapView
    private var _binding: FragmentMyDataBinding? = null
    private val binding get() = _binding!!
    lateinit var mainActivity: MainActivity
    var adapter = ChildRecyclerAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMyDataBinding.inflate(inflater, container, false)
        val root: View = binding.root
//        mMapView = binding.map
        mainActivity = requireActivity() as MainActivity

        //adding child
        binding.childAdd.setOnClickListener{
            findNavController().navigate(R.id.action_myDataFragment_to_childAddFragment)
        }

        
        //open menu for childRecycler
        adapter.onItemClick = {
            Log.i("qwe","qwe")
            Toast.makeText(requireContext(), "click", Toast.LENGTH_SHORT).show()
//            findNavController().navigate(R.id.)
        }

//        initGoogleMap(savedInstanceState)
        init()

        return binding.root
    }
    private fun init() = with(binding){
        childRecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        childRecycler.adapter = adapter
    }
//
//    @SuppressLint("MissingPermission")
//    override fun onMapReady(map: GoogleMap) {
//        if (ActivityCompat.checkSelfPermission(requireActivity(), Manifest.permission.ACCESS_FINE_LOCATION)
//            != PackageManager.PERMISSION_GRANTED
//            && ActivityCompat.checkSelfPermission(
//                requireActivity(),
//                Manifest.permission.ACCESS_COARSE_LOCATION
//            )
//            != PackageManager.PERMISSION_GRANTED
//        ) {
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return
//        }
//        map.isMyLocationEnabled = true
//    }
//    private fun initGoogleMap(savedInstanceState: Bundle?) {
//        // *** IMPORTANT ***
//        // MapView requires that the Bundle you pass contain _ONLY_ MapView SDK
//        // objects or sub-Bundles.
//        var mapViewBundle: Bundle? = null
//        if (savedInstanceState != null) {
//            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY)
//        }
//        mMapView.onCreate(mapViewBundle)
//        mMapView.getMapAsync(this)
//    }
//
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        var mapViewBundle = outState.getBundle(MAPVIEW_BUNDLE_KEY)
//        if (mapViewBundle == null) {
//            mapViewBundle = Bundle()
//            outState.putBundle(MAPVIEW_BUNDLE_KEY, mapViewBundle)
//        }
//        mMapView.onSaveInstanceState(mapViewBundle)
//    }
//
//
//    override fun onStart() {
//        super.onStart()
//        mMapView.onStart()
//    }
//
//    override fun onStop() {
//        super.onStop()
//        mMapView.onStop()
//    }
//
    override fun onResume() {
        super.onResume()
        mainActivity.hideBottomNav()
        mainActivity.putTitle("Мои данные")
    }

    override fun onPause() {
        super.onPause()
        mainActivity.showBottomNav()
    }
//
//    override fun onDestroy() {
//        mMapView.onDestroy()
//        super.onDestroy()
//    }
//
//    override fun onLowMemory() {
//        super.onLowMemory()
//        mMapView.onLowMemory()
//    }
}