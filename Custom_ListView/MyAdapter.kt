package karun.com.googlemapdemo

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.row_layout.view.*

class MyAdapter(private val context:Context, private val list:ArrayList<Model>) : BaseAdapter() {


    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

      val view:View=View.inflate(context,R.layout.row_layout,null)

        view.img.setImageResource(list[p0].avatar)
        view.tv.text=(list[p0].name)

        return view
    }

    override fun getItem(p0: Int): Any {
       return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
       return list.size
    }


}