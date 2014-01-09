package com.smartbear.soapui.fileutils.actions

import com.eviware.soapui.impl.support.http.HttpRequestTestStep
import com.eviware.soapui.support.UISupport
import com.eviware.soapui.support.action.support.AbstractSoapUIAction

class SaveResponseAction extends AbstractSoapUIAction<HttpRequestTestStep>{

    public SaveResponseAction()
    {
        super( "Save Response", "Saves last response to a file" );
    }

    @Override
    void perform(HttpRequestTestStep httpTestRequestStep, Object o)
    {
        def response = httpTestRequestStep.httpRequest.response
        if( response == null )
        {
            UISupport.showInfoMessage( "Missing Response for TestStep" );
            return
        }

        def data = response.rawResponseData
        if( data == null || data.length == 0 )
        {
            UISupport.showInfoMessage( "Empty Response data for TestStep" );
            return
        }

        def file = UISupport.fileDialogs.saveAs( this, "Save to file" )
        if( file != null )
        {
            def out = file.newOutputStream()
            out.write( data, (int)(data.length- response.contentLength), (int)response.contentLength )
            out.close()

            UISupport.showInfoMessage( "Wrote [" + response.contentLength + "] bytes to [" + file.name + "]");
        }
    }
}
