package ${PACKAGE_NAME}

import android.os.Bundle
import android.view.View
import in_.mai3.initiateandroid.ui.fragment.ViewBindingFragment
import in_.mai3.interviewhelper.databinding.${Layout_Binding}


class ${NAME}: ViewBindingFragment<${Layout_Binding}>(${Layout_Binding}::inflate){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
    }

}